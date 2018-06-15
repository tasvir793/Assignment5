Que:1 Study about static block and push 1 example code github?
Ans:1
package acadviewdemo;
public class Staticblock {
    public static void main(String args[]){
        System.out.println("I am Tasvir");
    }
    static{
        System.out.println("I am a stuborn");
    }
    
}

Que:2 Create a Class Animal , Dog and Cat , you need to override speak function of Animal Class?
Ana:2
package animal1;
public class Animal1 {
    public static void main(String[] args) {
            Animal1 animal=new Animal1();

            Animal1.speak();
            Dog1 dog=new Dog1();
            dog.speak();
            Cat1 cat=new Cat1();
            cat.speak();
        }
      
    }


package animal1;
public class Animall {
     String breed;
    String colour;
    public void speak()
    {
        System.out.println("i am an Animal !");
    }
    
}


package animal1;
public class Cat1 extends Animal1{
   String breed="Cat";
    String colour="Black";
    public void speak()
    {
        System.out.println("I am a Cat ! ");
    }
}


package animal1;
public class Dog1 extends Animal1{
      String breed="Dog";
    String colour="Brown";
    public void speak()
    {
        System.out.println("I am a Dog ! ");
    }
    
}

Que:4 Print length of longest increasing sub array?
Ans:4
package acadviewdemo;
public class SubArray {
    public static void main(String args[]){
        int arr[]={2,1,3,5,7,6,6,8,4};
        int max = 1,min = 1,temp = 0;
        for (int k=1;k<arr.length; k++)
        {
            if(arr[k]>arr[k-1])
                min++;
            else
            {
                if (max < min)
                {
                    max = min;
                    temp = k-max;
                }
              min=1;
            }
        }
                   
    if(max <min)
    {
        max = min;
        temp = arr.length - max;
    }
    
    for(int i = temp; i < max+temp;i++)
    {
    System.out.println(arr[i] + " ");
}
}