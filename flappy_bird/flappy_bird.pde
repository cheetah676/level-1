int birdX=100;
int birdY=100;
int width;
int height;
double birdYVelocity = 0;
double gravity = 0.2;
int pipeX=900;
void setup(){
  size(1000, 500);
}
void draw(){
  background(20, 50, 255);
  fill(255, 255, 10);
  ellipse(birdX, birdY, 10, 10);
  birdY+=birdYVelocity;
  birdYVelocity+=gravity;
  fill(100, 255, 120); 
  rect(pipeX, 300, 50, 300);
  rect(pipeX, 0, 50, 100);
  pipeX-=10;
  if (pipeX<= width){
    pipeX=900;
  }
  if (mousePressed){
    birdYVelocity= -5;
  }
}