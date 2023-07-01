fun main()
{
    val day=2
    val result=when(day)
    {
        1->"Monday"
        2->"Tue"
        3->"wed"
        4->"thu"
        5->"fri"
        6->"sat"
        7->"sun"
        else->"Invalid"
    }
    println(result)
}