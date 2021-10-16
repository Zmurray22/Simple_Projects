# Name: Zach Murray
# Date:  02/June/2021

import time  # time code executions
from datetime import date

from BubbleSort import BubbleSort
from Client import Client
from InsertionSort import InsertionSort
from MergeSort import MergeSort
from Quicksort import Quicksort
from SelectionSort import SelectionSort
from ShellSort import ShellSort


sort_type = ["BubbleSort", "SelectionSort", "InsertionSort",
             "ShellSort", "MergeSort", "QuickSort"]  # list to hold function names

client_list = ['ClientData100.csv', 'ClientData1000.csv', 'ClientData10000.csv']  # list to hold client files

report = []  # list to hold timing reports

# display name and date in output
print("Name: ", "Zach Murray")
today = date.today()
text_date = today.strftime("%B %d, %Y")  # format date
print("Date:", text_date)
print("-" * 20)

for j in range(0, 6):  # Iterate through sort methods
    for i in client_list:  # Iterate through client files
        clients = []  # list to hold client objects

        # read records from the ClientData*.csv file
        # into Client objects and place the Client objects into the list
        with open(i) as infile:
            for line in infile:
                # split the line based on the commas
                s = line.split(',')
                client_id = int(s[0])
                f_name = s[1]
                l_name = s[2]
                phone = s[3]
                email = s[4]
                # create a client object using the data from the file
                clt = Client(client_id, f_name, l_name, phone, email)
                # add the client object to the list
                clients.append(clt)

        # how many client objects do we have?
        num_records = len(clients)
        print("Number of Client Records:", num_records)
        print()
        # -----------------------------------------------------------------

        # Scenario: Sorting Records in a datafile
        section_title = "Sorting " + str(num_records) + " Records ({})".format(sort_type[j])
        print(section_title)
        print("-" * len(section_title))

        # How long does it take sort records?
        start_time = time.time()
        # Call static sort method within class
        if j == 0:
            BubbleSort.sort(clients)
        elif j == 1:
            SelectionSort.sort(clients)
        elif j == 2:
            InsertionSort.sort(clients)
        elif j == 3:
            ShellSort.sort(clients)
        elif j == 4:
            MergeSort.sort(clients)
        elif j == 5:
            Quicksort.sort(clients)
        else:
            print("Error")

        end_time = time.time()
        total_time = end_time - start_time
        report.append("\nSeconds to sort {0} records via {1}: {2:.6f} Seconds".format(num_records, sort_type[j],
                                                                                      total_time))
        for clt in clients:
            print(clt)
    print("-" * 30)
[print(i) for i in report]
