fun main() {
    //Declare and initialize 3 employees
    val emp1 = Employee("Marty Mcfly", PositionTitle.ADMINISTRATION, true, 27.00, 1, "10/26/1985")
    val emp3 = Employee("Doc Brown", PositionTitle.MAINTENANCE, false, 21.00, 3, "11/5/1955")
    val emp2 = Employee("George Mcfly", PositionTitle.PRODUCTION, false, 22.00, 2, "10/21/2015")

    //Add hours and print summary for each employee
    emp1.calculate(45.0);
    emp1.display();
    emp2.calculate(50.0);
    emp2.display();
    emp3.calculate(35.0);
    emp3.display();

}