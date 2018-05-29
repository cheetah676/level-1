int birdX=100;
int birdY=100;
int width;
int height;
int i=0;
double birdYVelocity = 0;
double gravity = .2;
int pipeX=900;
float topPipeLength=random(0, 300);
float bottomPipeLength=topPipeLength+140;
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
  rect(pipeX, 0, 50, topPipeLength);
  rect(pipeX, bottomPipeLength, 50, 400);
  pipeX-=1;
  fill(20, 10, 10);
  textSize(20);
  text(i, 500, 250);
  if (pipeX<=-10){
   pipeX=900;
   topPipeLength=random(0, 350);
   bottomPipeLength=topPipeLength+140;
   i++;
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
  if (intersects(birdX, birdY, pipeX, topPipeLength+140, 50)){
    println("You lose");
    System.exit(0);
  }
  else if(topIntersects(birdX, birdY, pipeX, topPipeLength, 50)){
    println("You lose");
    System.exit(0);
  }
}
boolean intersects(int birdX, int birdY, int paddleX, float paddleY, float paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}
boolean topIntersects(int birdX, int birdY, int paddleX, float paddleY, float paddleLength) {
if (birdY < paddleY + 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}