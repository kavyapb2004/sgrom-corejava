class CameraExecutor {

    public static void main(String[] args) {

        boolean createCamera = Camera.createCamera("Canon","EOS 1500D",45999.0,24,"Wide Angle",true,true, 1200, "Black", 475.5 );

        Camera.getCameraDetails();
    }
}