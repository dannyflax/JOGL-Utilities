package com.flaxapps.joglutil;

public class Vertex {
	public float x, y, z;
	public Vertex(float a,float b,float c){
		x=a;
		y=b;
		z=c;
	}
	public Vertex(){
		x=0;
		y=0;
		z=0;
	}
	@Override
    public int hashCode() {
        return (int) (x*y*z);
    }

    @Override
    public boolean equals(Object obj) {
       if (!(obj instanceof Vertex))
            return false;
        if (obj == this)
            return true;

        Vertex rhs = (Vertex) obj;
        return (rhs.x == x && rhs.y == y && rhs.z == z);
    }
    
    @Override
    public String toString(){
    	return "[X: " + x + ", Y: " + " Z: " + z + "]";
    }
    
    public float magnitude(){
    	return (float) Math.sqrt((double)Vertex.dot(this, this));
    }
    
    public static float distance(Vertex v1, Vertex v2){
    	return (float)Math.sqrt((double)((v1.x-v2.x)*(v1.x-v2.x)+(v1.y-v2.y)*(v1.y-v2.y)+(v1.z-v2.z)*(v1.z-v2.z)));
    }
    
    public static Vertex add(Vertex v1, Vertex v2){
    	return new Vertex(v1.x+v2.x,v1.y+v2.y,v1.z+v2.z);
    }
    
    public static float dot(Vertex v1, Vertex v2){
    	return v1.x*v2.x+v1.y*v2.y+v1.z*v2.z;
    }
    
    public static Vertex scalar(Vertex v1, float sc){
    	return new Vertex(v1.x*sc,v1.y*sc,v1.z*sc);
    }
    
}
