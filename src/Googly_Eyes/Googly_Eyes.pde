void setup(){
  PImage face = loadImage("download.jpg");
  size(800,600);
   face.resize(800, 600);
   background(face);
   
  
}
void draw(){
  if(mousePressed){
     System.out.println(mouseX+" "+mouseY);
   }
  //Left Eye
    if(mouseX<90){
     mouseX=90;
   }
   if(mouseX>140){
     mouseX=140;
   }
   if(mouseY>280){
     mouseY=280;
   }
   if(mouseY<240){
     mouseY=240;
   }
   fill(#FCFCFC);
   ellipse(117, 256, 70, 70);
 fill(#120202);
  ellipse(mouseX, mouseY, 20, 20);
  
   fill(#FCFCFC);
   ellipse(300, 256, 70, 70);
    fill(#120202);
  ellipse(mouseX+185 , mouseY, 20, 20);//change right pupil
   
  
   
   
   
   // Right Eye
    
  
   
}