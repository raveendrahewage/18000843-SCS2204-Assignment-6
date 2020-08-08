case class point(a:Int,b:Int)
{
    def x=a;
    def y=b;
    
    def invert():point=point(this.y,this.x);
    override def toString="("+x+","+y+")";
}

object Q4
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("\tPoint Adding");
		println("-------------------------------------\n");

		val p1=point(2,5);
		val p2=p1.invert();
		println("p1="+p1);
		println("p2="+p2);
		println("\n-------------------------------------");
	}

}
