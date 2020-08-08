case class point(a:Int,b:Int)
{
    def x=a;
    def y=b;
    
    def add(p:point):point=point(this.x+p.x,this.y+p.y);
    override def toString="("+x+","+y+")";
}

object Q1
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("\tPoint Adding");
		println("-------------------------------------\n");

		val p1=point(2,5);
		val p2=point(3,10);
		val p3=p1.add(p2);
		println("p1="+p1);
		println("p2"+p2);
		println("p3="+p3);
		println("\n-------------------------------------");
	}

}
