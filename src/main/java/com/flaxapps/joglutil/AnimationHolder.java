package com.flaxapps.joglutil;

import java.io.IOException;
import java.util.ArrayList;

import javax.media.opengl.GL2;

/**
 *
 * @author Danny
 */
public class AnimationHolder{ 
    ArrayList<ModelControl> objs = new ArrayList<ModelControl>();
    public int currentFrame = 0;
    
    public int maxFrame = 0;
    
    public void restart(){
        currentFrame = 0;
    }
    public ArrayList<Vertex> drawStillFrame(int frame, Vertex pos, GL2 gl, float rangle){
    	//Draws a single frame, leaving the animation in place
    	return objs.get(frame).drawModel(pos, gl, rangle);
    }
    
    public ArrayList<Vertex> drawStillFrame(Vertex pos, GL2 gl, float rangle){
    	//Draws current frame, leaving the animation in place
    	return objs.get(currentFrame).drawModel(pos, gl, rangle);
    }
    
    
    public ArrayList<Vertex> drawFrame(Vertex pos, GL2 gl, float rangle){
        //Draws a frame and moves the animation forward
    	ArrayList<Vertex> a = objs.get(currentFrame).drawModel(pos, gl, rangle);
        
        currentFrame++;
        if(currentFrame == maxFrame)
            currentFrame = 0;
        
        return a;
    }
    
    
    public AnimationHolder(String base, int start, int frames, int speed){
        for(int i = start; i<frames + start; i=i+speed){
         maxFrame++;
            ModelControl ap = new ModelControl();
          String s = base + "_";
          int numZeros = 0;
          if(i<100000)
              numZeros++;
          if(i<10000)
              numZeros++;
          if(i<1000)
              numZeros++;
          if(i<100)
              numZeros++;
          if(i<10)
              numZeros++;
          
          
          for(int i2 = 0; i2<numZeros; i2++){
              s = s.concat("0");
          }    
            
          s = s.concat(i+".obj");
	       
            
          try {
        	  ap.loadModelData(s);
		  } catch (IOException e) {
			  e.printStackTrace();
		  }
          
          objs.add(ap);
      }
    }
}
