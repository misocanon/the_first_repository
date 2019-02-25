public class Sample {

    public static final void main( String[] args ) {
        System.out.println( "Test" );

        Sample sample = new Sample();

        int result = sample.add( 1, 2 );

        System.out.println( "計算結果: " + result );
    }

    public int add( int x, int y ) {
        return x + y;
    }
}
