

public class Admin extends User {
public  Resturant  deleteResturant(Resturant resturant){
int restId;
    System.out.println("Enter resturant id to delete ");
Resturant[] newRest = new Resturant[resturant.length];
    for (i:resturant) {
        if (resturant.shopId == restId)
        {
           resturant[i]=null;
           break;
        }
    }
    for (int i = 0; i < resturant.length; i++) {
        if(resturant[i]==null)
            continue;
        else
            newRest[i] = resturant[i];
    }
    return newRest;
}

public Resturant setNewResturant()     //this method is a parameter for addResturantToResturants();
{
    System.out.println("Enter resturant name ");             //
    System.out.println("Enter resturant phone number ");     //
    System.out.println("Enter resturant Adress ");           //
    System.out.println("Enter resturant category ");           //this will be in textbox
    System.out.println("Enter resturant  ");                 //
    System.out.println("Enter resturant name ");             //
    System.out.println("Enter resturant name ");             //

    Resturant resturant = new resturant(name,phoneNumber,category,etc);
    return resturant;
}

public Resturant addResturantToResturants(Resturant[] allResturants,Resturant newResturant,String,String){

    for (i:allResturants) {
        if(allResturants[i] == null)
        {
            allResturants[i]=newResturant;
        }
    }
    return allResturants;
}


public  Item addItemToMenu( Resturant resturant,int resturantId,String itemName,int itemPrice)
{
 for (i :resturant) {
  if(resturant[i].shopId == resturantId)
  {
   Item newItem = new Item(itemName,itemPrice);
   Item[] arrOfItem = new Item[resturant.menu.length+1];
      for (int i = 0; i < arrOfItem.length; i++) {
          arrOfItem[i]= resturant.menu[i];
      }
      arrOfItem[arrOfItem.length-1] = newItem;
   resturant.menu = arrOfItem;
   break;
  }

 }
 return resturant.menu;

}



public Item removeItemFromMenu(Item[] item , int itemIndex)
{
    Item newItem = new Item[item.length];
    item[itemIndex]= null;
    int j=0;
    for (int i = 0; i < item.length; i++) {
        if(item[i]==null)
            continue;
        newItem[j]= item[j];
        j++;
    }
return newItem;
}

 public  void displayAllResturants ()
 {
int j=0;
   for(i : resturant)
   {
       if(resturant[i] == null)
           continue;
       System.out.println((j+1) +" "+ resturant[i].name);  //this will be in textbox
       j++;
   }
 }

 }

public  int updateItemPrice(int newPrice)
{

  return newPrice;
}

public  void displayResturantMenu(Resturant)
{
 for (i : resturant.menu)
  {
  System.out.println((i+1)+" "+resturant.menu[i].name+" Price -> " resturant.menu[i].price);//this will be in textbox
  }

}



public  String DisplayMostRatedResturant(Resturant[] )
{
 int maxRate=0;
 int resturantNumnber =0;
 for( i : resturant)
 {
   if(resturant[i].review.rating >= maxRate)
   { maxRate = resturant[i].review.rating;
    resturantNumnber=i;
   }
 }
 return resturant[i].name;
}