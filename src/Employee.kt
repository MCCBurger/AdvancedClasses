import java.text.DecimalFormat

class Employee(
    var name: String,
    var position: PositionTitle,
    var salary: Boolean,
    var payRate: Double,
    var shift: Int,
    var startDate: String
) {
    //Declare and initialize variables
    private val currency = DecimalFormat("\$###,###,###.00")
    private var payment = 0.0;
    private var weeklyPay = ""

    //Calculate weekly pay based on rate,shift, and hours worked
    fun calculate(hoursIn: Double) {

        if (shift == 2)
            payRate *= 1.05

        if (shift == 3)
            payRate *= 1.10

        if (hoursIn <= 40.00)
            payment = payRate * hoursIn
        else {
            payment = payRate * 40
        }

        if (!salary)
            if (hoursIn > 40)
                payment += (hoursIn - 40) * 1.5 * payRate

        weeklyPay = currency.format(payment)

    }

    //Print all employee information
    fun display() {
        println("\n$name\nStart Date: $startDate\n$position Is salary: $salary shift: $shift\nRate of Pay is: ${currency.format(payRate)} per hour\n$name earned $weeklyPay this week\n")
    }

}