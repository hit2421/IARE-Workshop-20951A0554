salary=int(input("enter:"))
federal=float(input())
state=float(input())
pension=float(input())
weeks=int(input())
total_deduction=(federal+state+pension)/100
salary_after_deduction=salary*(total_deduction)
a=(salary-salary_after_deduction)
b=a*weeks
print("salary deducted per week is:",a)
print("salary after deduction is:",b)