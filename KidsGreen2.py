#    -*- coding: utf-8 -*-
#   By: Zach Murray
#   Project: Student's Covid-19 Daily Symptom Questionare Automator
#   Description: Automatically fills out web form for my multiple kids, crops the relevent
#       confirmation section, and saves the image to a location for presentation at morning dropoff.
#_______________________________________________________________________________________________

from PIL import Image #Image Crop
from selenium import webdriver #Selenium Web automation Extension
path = "C:/Program Files (x86)/Geckodriver-v0.29.1-win64" #Firefox driver for Selenium
import time #To wait for page load

#   Global Variables
Kids = ["#", "#", "#"]#  Student Id's
fileName = ["Billy", "Bob", "Joe"]# Student names
i = 0 # Iterator to coordinate name and ID



#   Program Start_________________________________________________________
#   Open the website
driver = webdriver.Firefox(path) 


for StudentID in Kids:#    Iterates through the list of students
    
    #   Access website
    driver.get("https://nisdhealthscreening.nisd.net/?Loc=119")
    
    #   Select Student Button
    studentRadio = driver.find_element_by_id('MainContent_userList_3')#    Finds element by HTML id
    studentRadio.click()#  Clicks element

    #   Enter for next page
    nextButton1 = driver.find_element_by_id('MainContent_userSelectionButton')
    nextButton1.click()  

    #   Select English
    englishButton = driver.find_element_by_id('MainContent_languageSelectionList_0')
    englishButton.click()
    
    #   Enter for next page
    nextButton2 = driver.find_element_by_id('MainContent_continueButton')
    nextButton2.click()
  
    #   Enter Student Id
    boxID = driver.find_element_by_id('MainContent_studentIdTextBox')
    boxID.send_keys(StudentID)# Sends variable data to textbox element
    
    #   Select date (today)
    dateRadio = driver.find_element_by_id('MainContent_dateSelectionList_0')
    dateRadio.click()
    
    #   Verify ID Button
    verifyID = driver.find_element_by_id('MainContent_studentVerifyButton')
    verifyID.click()
    
    time.sleep(2)#  Delays further action to make sure web page is loaded first

    #   Attempt to fill out radio button form, but if it has been done previously and saved, this page will be skipped and cause error
    try:    #Makes and attempt but won't crash if fails
        #   Question 1 Button
        Radio1 = driver.find_element_by_id('MainContent_studentQn1NoRadioBtn')
        Radio1.click()
        
        #   Question 2 Button
        Radio2 = driver.find_element_by_id('MainContent_studentQn9NoRadioBtn')
        Radio2.click()
        
        #   Question 3 Button
        Radio3 = driver.find_element_by_id('MainContent_studentQn10NoRadioBtn')
        Radio3.click()
    
        time.sleep(2)
        
        # Final Submit
        submitButton = driver.find_element_by_id('MainContent_studentSubmissionButton')
        submitButton.click()
    except:#   Catches error exception and performs an action, then continues with program
        print("Nada")
    
    #   Save Screenshot with Name coordinating to Kid id number
    driver.save_screenshot(r'E:/Repos/KidsGreen/{}.png'.format(fileName[i]))#   Project folder
    
    #   Crop_________________________________________________________________
    #   Opens an image in RGB mode
    im = Image.open(r'E:/Repos/KidsGreen/{}.png'.format(fileName[i]))
    
    #   Setting the points for cropped image
    left = 200
    top = 40
    right = 1000
    bottom = 400
      
    #   Cropped image of above dimension
    im1 = im.crop((left, top, right, bottom))
    #   Save as a new file in new folder (My google drive)  
    im1.save('E:/Google Drive/Kids School/{}.png'.format(fileName[i]))

    #   Increment Iterator
    i += 1
    
#   Close Web Page    
driver.quit()
#   Reset iterator
i = 0

#Program End__________________________________________________________________
