import ddf.minim.*;
Minim minim;
AudioSample sound;  
int ballX=500;
int ballY=500;
int speedX=13;
int speedY=10;
void setup(){
  minim = new Minim (this);
  sound = minim.loadSample("doorbump.wav", 128);
  size(1000, 1000);
}
void draw(){
  background(0, 0, 90);
  ellipse(ballX, ballY, 15, 15);
  fill(25, 255, 255);
  stroke(60, 240, 0);
  fill(255, 255, 255);
  rect(mouseX, 980, 300, 20);
  ballX-=speedX;
  ballY-=speedY;
  if(ballX<=0){
    speedX= -13;
    sound.trigger();    
    println("bounce");
  }
  else if(ballX>=1000){
    speedX=13;
    println("bounce");
    sound.trigger();    
  }
  else if(ballY<=0){
   speedY-=10;
   println("bounce");
   sound.trigger();    
  }
  else if(ballY>=1000){
   speedY=10;
   println("bounce");
   sound.trigger();    
  }
}