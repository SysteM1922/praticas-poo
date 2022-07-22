package Ex72;

import java.lang.Math;

public class ObjetoMovel {
    private float x,y = 0;
    private double d = 0;

    public ObjetoMovel(){
        x=0;
        y=0;
        d=0;
    }

    public float[] getCords(){
        return new float[]{this.getX(),this.getY()};
    }

    public float[] move(float X, float Y){
        d+=Math.sqrt(Math.pow((X-x),2)+Math.pow((Y-y),2));
        this.setCords(X, Y);
        return new float[]{X,Y};
    }

    public void setCords(float x, float y){
        this.setX(x);
        this.setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(d);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + Float.floatToIntBits(x);
        result = prime * result + Float.floatToIntBits(y);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ObjetoMovel other = (ObjetoMovel) obj;
        if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
            return false;
        if (Float.floatToIntBits(x) != Float.floatToIntBits(other.x))
            return false;
        if (Float.floatToIntBits(y) != Float.floatToIntBits(other.y))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ObjetoMovel [d=" + d + ", x=" + x + ", y=" + y + "]";
    }

}
