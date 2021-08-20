object q02 extends App {
  val a = new Rational(1,5)
  val b = new Rational(3,7)
  val c = new Rational(6,9)

  val x = a-b-c

  println(x)
}

class Rational(n:Int, d:Int) {
  require(denom > 0, "Denominator is greater than 0")
  def numer = n
  def denom = d
  def neg = new Rational(-this.numer, this.denom)
  def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
  def -(r:Rational) = this.add(r.neg)

  override def toString(): String = numer + "/" + denom
}