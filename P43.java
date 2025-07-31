class Main {
	public static void main(String[] args) {
	double Sh,h,r,pi,rps,A,C;
	Sh=5;
	h=4;
	rps=10;
	pi=3.1416;
	r=Math.sqrt(Sh*Sh-h*h);
	A=pi*r*r;
	C=A*rps;
	System.out.println("C:"+C);	
	}
}