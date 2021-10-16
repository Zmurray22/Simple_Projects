#Zach Murray


#A program that calculates how much time it will take for a certain number

#of workers to stock a certain number of cases.

cases_per_pallet = 180

#the factor_variable adds to the worktime

factor_variable = 4

#calculate the total amount of cases

def cases_total(pallets):

    case_count = (pallets * 180)

    return case_count

#figure out how much each person must stock

def per_person(var1, var2):

    each_person = ( var1 / var2)

    return each_person

#figure out how much time it will take each person to stock their portion

def hours_work(each):

    work_hours = (each / 100)

    return work_hours


print("Welcome to the workload calculator")


#keeps looping until integer responses are given

#while False:

truck = float(input("How many pallets are there?: "))

people = int(input("How many personnel do you have?: "))


#how much time it will take each person to complete stocking 

total = cases_total(truck)

average = float(per_person(total, people))   

hours_per = hours_work(average)


#final calculation of work hours needed to complete the truck     

time = hours_per + 4

print("Today's truck will take " + str(time) + " hours to breakdown.")

print("Thank you for using the workload calculator.")
