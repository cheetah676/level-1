Car car1=new Car();
Car car2=new Car();
Car car3=new Car();
Car car4=new Car();
Car car5=new Car();
Car car6=new Car();
Car car7=new Car();
int frogX=200;
int frogY=380;
void setup(){
  size(400, 400);
}
  class Car{
  float carX=random(400);
  float carY=random(400);
  float carSize=random(100);
  float carSpeed=random(100);

void display() {
      fill(255,100,100);
      rect(carX, carY, carSize, 50);
}
void carMoveLeft(){
  carX+=carSpeed;
  if (carX>=width){
    carX=0;
  }
}
void carMoveRight(){
  carX-=carSpeed;
  if (carX<=0){
   carX=400; 
  }
}
  }

void draw(){
  background(0, 0, 255);
car1.display();
car2.display();
car3.display();
car4.display();
car5.display();
car6.display();
car7.display();
fill(20, 255, 10);
  stroke(0, 0, 0);
ellipse(frogX, frogY, 20, 20);
car1.carMoveLeft();
car2.carMoveRight();
car3.carMoveLeft();
car4.carMoveRight();
car5.carMoveLeft();
car6.carMoveRight();
car7.carMoveLeft();
if (frogX==0){
  frogX+=20;
}
else if (frogX==400){
  frogX-=20;
}
else if (frogY==0){
frogY+=20;
} 
else if (frogY==400){
  frogY-=20;
}
}
void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
                  //Frog Y position goes up
                  frogY-=10;
            }
            else if(keyCode == DOWN)
            {
                  //Frog Y position goes down 
                  frogY+=10;
            }
            else if(keyCode == RIGHT)
            {
                  //Frog X position goes right
                  frogX+=10;
            }
            else if(keyCode == LEFT)
            {
                  //Frog X position goes left
                  frogX-=10;
            }
      }
}
  