case class point(a:Int,b:Int)
{
    def x=a;
    def y=b;
    
    def move(dx:Int,dy:Int):point=point(this.x+dx,this.y+dy);
    override def toString="("+x+","+y+")";
}

object Q2
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("\tPoint Adding");
		println("-------------------------------------\n");

		val p1=point(2,5);
		val p2=p1.move(6,7);
		println("p1="+p1);
		println("p2="+p2);
		println("\n-------------------------------------");
	}

}
