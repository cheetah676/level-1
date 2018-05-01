int frogX=200;
int frogY=380;
Car car1=new Car(random (400), random(300), random (100), 4);
Car car2=new Car(random (400), random(300), random (100), 1);
Car car3=new Car(random (400), random(300), random (100), 1);
Car car4=new Car(random (400), random(300), random (100), 4);
Car car5=new Car(random (400), random(300), random (100), 3);
Car car6=new Car(random (400), random(300), random (100), 1);
Car car7=new Car(random (400), random(300), random (100), 2);
void setup() {
  size(400, 400);
}
public class Car {
  float carX=random(400);
  float carY=random(50, 400);
  float carSize=random(100);
  float carSpeed=random(5);
  public Car(float carX, float carY, float carSize, int carSpeed) {
    this.carX=carX;
    this.carY=carY;
    this.carSize=carSize;
    this.carSpeed=carSpeed;
  }
  float getY() {
    return carY;
  }
  float getX() {
    return carX;
  }
  float getSize() {
    return carSize;
  }

  void display() {
    fill(random(255), random(255), random(255));
    rect(carX, carY, carSize, 50);
  }
  void carMoveLeft() {
    carX+=carSpeed;
    if (carX>=width) {
      carX=0;
    }
  }
  void carMoveRight() {
    carX-=carSpeed;
    if (carX<=0) {
      carX=400;
    }
  }
}
void draw() {
  background(0, 0, 255);
  ellipse(frogX, frogY, 20, 20);
  stroke(0, 0, 5);
  car1.display();
  car2.display();
  car3.display();
  car4.display();
  car5.display();
  car6.display();
  car7.display();
  car1.carMoveLeft();
  car2.carMoveRight();
  car3.carMoveLeft();
  car4.carMoveRight();
  car5.carMoveLeft();
  car6.carMoveRight();
  car7.carMoveLeft();
  fill(20, 255, 10);
  if (intersects(car1)) {
    println("Gameover");
    System.exit(0);
  } else if (intersects(car2)) {
    println("Gameover");
    System.exit(0);
  } else if (intersects(car3)) {
    println("Gameover");
    System.exit(0);
  } else if (intersects(car4)) {
    println("Gameover");
    System.exit(0);
  } else if (intersects(car5)) {
    println("Gameover");
    System.exit(0);
  } else if (intersects(car6)) {
    println("Gameover");
    System.exit(0);
  } else if (intersects(car7)) {
    println("Gameover");
    System.exit(0);
  }
  intersects(car2);  
  intersects(car3);  
  intersects(car4);  
  intersects(car5);  
  intersects(car6);  
  intersects(car7);  
  if (frogX==0) {
    frogX+=20;
  } else if (frogX==400) {
    frogX-=20;
  } else if (frogY==0) {
    println("You WIN");
    text("YOU Win", 200, 200); 
  textSize(20); 

    frogY+=20;
  } else if (frogY==400) {
    frogY-=20;
  }
}
void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      //Frog Y position goes up
      frogY-=10;
    } else if (keyCode == DOWN)
    {
      //Frog Y position goes down 
      frogY+=10;
    } else if (keyCode == RIGHT)
    {
      //Frog X position goes right
      frogX+=10;
    } else if (keyCode == LEFT)
    {
      //Frog X position goes left
      frogX-=10;
    }
  }
}
boolean intersects(Car car) {
  if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+car.getSize()))
    return true;
  else 
  return false;
}
