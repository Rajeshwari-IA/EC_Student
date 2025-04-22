package pack;

public class Box {
	int width;
	int length;
	int height;
	float l;
	float w;
	float h;
	
	public Box(float l, float w, float h) {
		super();
		this.l = l;
		this.w = w;
		this.h = h;
	}
	public Box(int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	
public Box(int length) {
		super();
		this.length=length;
		this.width= length;
		this.height=length;
		
	}
void volume()
{
	System.out.println(length*width*height);
}
}

   
 
 
