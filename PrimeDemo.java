public class PrimDemo {
    public static void main(String args[]){
    int num=5,flag=0,i;
    for(i=2;i<=num/2;i++)
    {
        if(num ==0)
        {
        System.out.println(num+" is not a prime number ");
        flag = 1;
        break;
    }
}
if(flag == 0)
{
    System.out.println(num+" is a prime number ");
}
}
}
