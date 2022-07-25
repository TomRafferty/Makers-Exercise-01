object FizzBuzz {
  def generate(number: Int): String = {
    val allNums: Array[Int] = (1 to number).toArray
    allNums.map(num => {
      if(num % 3 == 0 && num % 5 == 0){
        "FizzBuzz"
      }else if(num % 3 == 0){
        "Fizz"
      }else if(num % 5 == 0){
        "Buzz"
      }else{
        num
      }
    }).mkString(", ")
  }
}

/*
-----------------------------------------------------------------------------------
notes:
-------

  - I'd like to reduce the number of if statements used in functions like this.
  However from my knowledge Scala's ternary interpretation is a bit weird and is
  essentially still just if/else statements :-/

  - I hadn't used tests before somehow so this was an interesting experience as
  I had difficulty getting the import of the test to work - had to refresh
  sbt(left a comment on the build.sbt file)

-----------------------------------------------------------------------------------
*/