object q04 extends App{
  val x1 = new Account("980930416v",456123,8750.00)
  val x2 = new Account("435716653v",879465,-500.00)
  val x3 = new Account("808774687v",785613,-450.00)
  val x4 = new Account("317868969v",549861,3500.00)
  val x5 = new Account("871008786v",489466,2500.00)

  var bank:List[Account]=List(x1,x2,x3,x4,x5)


  val overdraft = (b:List[Account])=>b.filter(x=>x.balance<0)
  println(s"Negative Accounts :- ${overdraft(bank)}")


  val balance  = (b:List[Account])=>(b.map(x=>x.balance)).reduce((x,y)=>x+y)
  println(s"\nSum of Account balances = ${balance(bank)}")

  val interest = (b:List[Account])=>b.map((x)=>(x.nic,x.accno,if(x.balance > 0)(x.balance + (x.balance * 0.5))
                                                                      else (x.balance + (x.balance * 0.1))))
  println(s"\nFinal Account balance :- ${interest(bank)}")

  class Account(id:String, n:Int, bal:Double){
    var nic:String = id
    var accno:Int = n
    var balance:Double = bal

    override def toString = s"[${nic} : ${accno} : ${balance}]"
  }
}
