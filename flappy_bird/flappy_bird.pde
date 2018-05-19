int birdX=100;
int birdY=100;
int width;
int height;
int i=1;
double birdYVelocity = 0;
double gravity = 0.2;
int pipeX=900;
float bottomPipeLength=random(0, 200);
float topPipeLength=random(200, 400);
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
  rect(pipeX, 0, 50, bottomPipeLength);
  rect(pipeX, topPipeLength, 50, 400);
  pipeX-=10;
  if (pipeX<=0){
   pipeX=900;
   bottomPipeLength=random(0, 350);
   topPipeLength=bottomPipeLength+140;
  }
  if (mousePressed){
    birdYVelocity= -5;
  }
  if (birdY>=500){
    birdY=0;
  }
  else if(birdY<=0){
    birdY=500;
  }
  //if (intersects(birdX, birdY, pipeX, 0, bottomPipeLength)){
    //println("You lose");
    //System.exit(0);
  //}
}
boolean intersects(int birdX, int birdY, int paddleX, int paddleY, float paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}