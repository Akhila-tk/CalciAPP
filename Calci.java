import java.util.Scanner
public interface Calci{
int add(int a,int b);
}
class CalciImpl implements Calci{
public int add(int a,int b){
return a+b;
}
}
class CalciDriver{
public static void main(String[] args)
{
System.out.println("enter two numbers to print sum");
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
Calci c=new CalciImpl();
System.out.println(c.add(n1,n2));
sc.close();
}
}