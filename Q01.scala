object q01 extends App {
  val a = new rational(2,3)
  val b = new rational(6,7)
  println(a)
  val x = a.add(b)
  println(x)
}

class rational(n:Int, d:Int) {
  require(denom > 0, "Denominator is greater than 0")
  def numer = n
  def denom = d

  def add(r:rational) = new rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
  def neg = new rational(-this.numer, this.denom)
  override def toString(): String = numer + "/" + denom
}
