public class Sample {

    public static final void main( String[] args ) {
        System.out.println( "Test" );

        Sample sample = new Sample();

        int result = sample.add( 1, 2 );

        System.out.println( "計算結果: " + result );

        int result2 = sample.minus( 5, 3 );

        System.out.println( "引き算の結果: " + result2 );
    }

    public int add( int x, int y ) {
        return x + y;
    }

    public int minus( int x, int y ) {
        return x - y;
    }
}
