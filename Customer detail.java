# Base class
class Person:
    def __init__(self, name, contact):
        self.name = name
        self.contact = contact

# Derived class Employee
class Employee(Person):
    def __init__(self, name, contact, empID, designation):
        super().__init__(name, contact)  # Call Person's constructor
        self.empID = empID
        self.designation = designation

    def display_employee(self):
        print(f"Employee Name: {self.name}")
        print(f"Contact: {self.contact}")
        print(f"Employee ID: {self.empID}")
        print(f"Designation: {self.designation}")

# Derived class Customer
class Customer(Person):
    def __init__(self, name, contact, customerID, invoiceNo):
        super().__init__(name, contact)
        self.customerID = customerID
        self.invoiceNo = invoiceNo

    def display_customer(self):
        print(f"Customer Name: {self.name}")
        print(f"Contact: {self.contact}")
        print(f"Customer ID: {self.customerID}")
        print(f"Invoice No: {self.invoiceNo}")


# Example usage
emp = Employee("Alice", 9876543210, 101, "Manager")
cust = Customer("Bob", 9123456780, 201, 5001)

emp.display_employee()
print()
cust.display_customer()
