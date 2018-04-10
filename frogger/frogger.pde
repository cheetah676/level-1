int frogX=200;
int frogY=380;
void setup(){
  size(400, 400);
}
  class Car{
  float carX=random(400);
  float carY=random(400);
  float carSize=random(100);
  int carSpeed=5;

void display() {
      fill(0,255,0);
      rect(carX, carY, carSize, 50);
}
display();
} 
void draw(){
  background(0, 0, 255);
  fill(20, 255, 10);
  stroke(0, 0, 0);
ellipse(frogX, frogY, 20, 20);
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