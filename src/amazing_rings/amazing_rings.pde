  int movinga = 250;
  int movingb = 750;
void setup()
{
  size(1000,800);
}
void draw()
{
  int diameter = 400; 
background(#FFFFFF);

  for(int repeat = 0; repeat <=40; repeat++){
  noFill();
    ellipse(movinga,400,diameter,diameter);
    ellipse(movingb,400,diameter,diameter);
  diameter-= 10; 
}
movinga += 1;
movingb -= 1;

}