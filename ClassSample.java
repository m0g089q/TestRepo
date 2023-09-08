 class Cuboid{
	private int l,b,h;
	Cuboid(){
		l=3;
		b=4;
		h=5;
	}
	Cuboid(int a){
		this.l=this.b=this.h=a;
	}
	Cuboid(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	Cuboid(float l,int b,int h){
		this.l=(int)l;
		this.b=b;
		this.h=h;
	}
	Cuboid(int l,int b, long h){
		this.l=l;
		this.b=b;
		this.h=(int)h;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int volume (){
		return getL()*getB()*getH();
	}
}

public class ClassSample {

	public static void main(String[] args) {
		Cuboid c1=new Cuboid(10);
		System.out.println(c1.volume());
		
		Cuboid c2=new Cuboid(12,10,2);
		System.out.println(c2.volume());
	
		Cuboid c3=new Cuboid();
		System.out.println(c3.volume());
		
		Cuboid c4=new Cuboid(12.0f,10,2);
		System.out.println(c4.volume());
		
		Cuboid c5=new Cuboid(12,10,10000L);
		System.out.println(c5.volume());
	}

}
