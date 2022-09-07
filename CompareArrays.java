class CompareArrays{
public static void main(String[] args)
{
int[] array1={1,2,3,4,5};
int[] array2={1,2,3,7,5};
boolean value=java.util.Arrays.equals(array1,array2);
if(value==true){
System.out.println("Two arrays are equal");
}
else
{
	System.out.println("Two arrays are not equal");
	
}
}
}
