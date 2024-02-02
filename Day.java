package iF;

import java.util.*;
class Day{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
while(true) {
System.out.println("enter the number to check day");
int a=s.nextInt();
switch(a){
case 1:
System.out.println("it is monday");
return;
case 2:
System.out.println("it is tuesday");
return;

case 3:
System.out.println("it is wednesday");
return;
case 4:
System.out.println("it is thursday");
return;
case 5:
System.out.println("it is friday");
return;
case 6:
System.out.println("it is saturday");
return;
case 7:
System.out.println("it is sunday");
return;
default:
System.out.println("entered invalid number");
break;
}
}
}
}