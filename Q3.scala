case class point(a:Int,b:Int)
{
    def x=a;
    def y=b;
    
    def distance(p:point):Double=scala.math.sqrt(scala.math.pow(this.x-p.x,2)+scala.math.pow(this.y-p.y,2));
}

object Q3
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("\tPoint Adding");
		println("-------------------------------------\n");

		val p1=point(2,4);
		val p2=point(6,7);
		val dis=p1.distance(p2);
		println("Distance="+dis);
		println("\n-------------------------------------");
	}

}
