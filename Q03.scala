
object q03 extends App{
  val a = new Account("980930416v", 15123565,5000.00)
  val b = new Account("556641282v", 21548468, 4350.50)
  a.transfer(b,550.00)
  println(a)
  println(b)
  class Account(id:String, n:Int, bal:Double){
    var nic:String = id
    var accno:Int = n
    var balance:Double = bal

    def withdraw(amount:Double)={
      this.balance = this.balance - amount
    }

    def deposit(amount:Double)={
      this.balance = this.balance + amount
    }
    def transfer(a:Account,b:Double)={
      this.withdraw(b)
      a.deposit(b)
    }
    override def toString = s"[${nic} : ${accno} : ${balance}]"

  }
}
