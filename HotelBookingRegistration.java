class HotelBookingRegistration {

    public static void main(String[] hostelbooking) {
        // invoke save Hotel Booking Registration
        saveHotelBookingRegistration(
            "Taj",
            "Deluxe",
            5000
        );
    }

    static void saveHotelBookingRegistration(
            String hotelName,
            String roomType,
            int pricePerNight) {

        System.out.println("Hotel Booking");
        System.out.println("Hotel: " + hotelName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: " + pricePerNight);
    }
}
