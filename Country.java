class Country{

    public static String[] findStatesByCountry(String countryName) {

        System.out.println("Invoked findStatesByCountry...\n");

        if(countryName == "India"){
            String[] indiaStates = {
                "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar",
                "Chhattisgarh","Goa","Gujarat","Haryana",
                "Himachal Pradesh","Jharkhand","Karnataka","Kerala",
                "Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
                "Mizoram","Nagaland","Odisha","Punjab",
                "Rajasthan","Sikkim","Tamil Nadu","Telangana",
                "Tripura","Uttar Pradesh","Uttarakhand","West Bengal"
            };
            return indiaStates;
        }

        else if(countryName == "United States"){
            String[] usStates = {
                "Alabama","Alaska","Arizona","Arkansas","California",
                "Colorado","Connecticut","Delaware","Florida","Georgia",
                "Hawaii","Idaho","Illinois","Indiana","Iowa",
                "Kansas","Kentucky","Louisiana","Maine","Maryland",
                "Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
                "Montana","Nebraska","Nevada","New Hampshire","New Jersey",
                "New Mexico","New York","North Carolina","North Dakota","Ohio",
                "Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
                "South Dakota","Tennessee","Texas","Utah","Vermont",
                "Virginia","Washington","West Virginia","Wisconsin","Wyoming"
            };
            return usStates;
        }

        else if(countryName == "Australia"){
            String[] australiaStates = {
                "New South Wales","Queensland","South Australia",
                "Tasmania","Victoria","Western Australia"
            };
            return australiaStates;
        }

        else if(countryName == "Canada"){
            String[] canadaStates = {
                "Alberta","British Columbia","Manitoba","New Brunswick",
                "Newfoundland and Labrador","Nova Scotia","Ontario",
                "Prince Edward Island","Quebec","Saskatchewan"
            };
            return canadaStates;
        }

        else if(countryName == "Germany"){
            String[] germanyStates = {
                "Bavaria","Berlin","Brandenburg","Bremen",
                "Hamburg","Hesse","Lower Saxony","Saxony",
                "Saxony-Anhalt","Thuringia"
            };
            return germanyStates;
        }
		        else if(countryName == "France"){
            String[] franceStates = {
                "Auvergne-Rhone-Alpes","Bourgogne-Franche-Comte","Brittany",
                "Centre-Val de Loire","Corsica","Grand Est",
                "Hauts-de-France","Ile-de-France","Normandy",
                "Nouvelle-Aquitaine","Occitanie","Pays de la Loire",
                "Provence-Alpes-Cote d'Azur"
            };
            return franceStates;
        }

        else if(countryName == "Italy"){
            String[] italyStates = {
                "Lombardy","Lazio","Campania","Sicily","Veneto",
                "Piedmont","Tuscany","Emilia-Romagna",
                "Apulia","Calabria","Liguria","Sardinia"
            };
            return italyStates;
        }

        else if(countryName == "Spain"){
            String[] spainStates = {
                "Andalusia","Catalonia","Madrid","Valencia",
                "Galicia","Castile and Leon","Basque Country",
                "Aragon","Canary Islands","Balearic Islands"
            };
            return spainStates;
        }

        else if(countryName == "Brazil"){
            String[] brazilStates = {
                "Sao Paulo","Rio de Janeiro","Bahia","Parana",
                "Minas Gerais","Ceara","Pernambuco",
                "Rio Grande do Sul","Goias","Amazonas"
            };
            return brazilStates;
        }

        else if(countryName == "Mexico"){
            String[] mexicoStates = {
                "Chihuahua","Jalisco","Puebla","Guanajuato",
                "Veracruz","Yucatan","Sonora",
                "Nuevo Leon","Oaxaca","Baja California"
            };
            return mexicoStates;
        }

        else if(countryName == "Japan"){
            String[] japanStates = {
                "Hokkaido","Aomori","Tokyo","Osaka",
                "Kyoto","Hiroshima","Fukuoka",
                "Okinawa","Nagano","Niigata"
            };
            return japanStates;
        }

        else if(countryName == "China"){
            String[] chinaStates = {
                "Guangdong","Beijing","Shanghai","Sichuan",
                "Zhejiang","Hubei","Henan",
                "Shandong","Jiangsu","Fujian"
            };
            return chinaStates;
        }

        else if(countryName == "Russia"){
            String[] russiaStates = {
                "Moscow","Saint Petersburg","Siberia",
                "Tatarstan","Chechnya","Bashkortostan",
                "Sakha","Krasnodar","Kaliningrad","Novosibirsk"
            };
            return russiaStates;
        }

        else if(countryName == "South Africa"){
            String[] saStates = {
                "Gauteng","Western Cape","Eastern Cape",
                "KwaZulu-Natal","Free State",
                "Limpopo","Mpumalanga",
                "North West","Northern Cape"
            };
            return saStates;
        }

        else if(countryName == "Argentina"){
            String[] argentinaStates = {
                "Buenos Aires","Cordoba","Santa Fe",
                "Mendoza","Salta","Chaco",
                "Entre Rios","Tucuman","Misiones","Formosa"
            };
            return argentinaStates;
        }

        else if(countryName == "Indonesia"){
            String[] indonesiaStates = {
                "Jakarta","Bali","West Java","Central Java",
                "East Java","Sumatra","Kalimantan",
                "Sulawesi","Papua","Yogyakarta"
            };
            return indonesiaStates;
        }

        else if(countryName == "Pakistan"){
            String[] pakistanStates = {
                "Punjab","Sindh","Khyber Pakhtunkhwa",
                "Balochistan","Islamabad Capital Territory"
            };
            return pakistanStates;
        }

        else if(countryName == "Bangladesh"){
            String[] bangladeshStates = {
                "Dhaka","Chittagong","Khulna",
                "Rajshahi","Barisal","Sylhet",
                "Rangpur","Mymensingh"
            };
            return bangladeshStates;
        }

        else if(countryName == "Nepal"){
            String[] nepalStates = {
                "Province No 1","Madhesh","Bagmati",
                "Gandaki","Lumbini",
                "Karnali","Sudurpashchim"
            };
            return nepalStates;
        }

        else if(countryName == "Sri Lanka"){
            String[] sriLankaStates = {
                "Western","Central","Southern",
                "Northern","Eastern",
                "North Western","North Central",
                "Uva","Sabaragamuwa"
            };
            return sriLankaStates;
        }

        else if(countryName == "United Kingdom"){
            String[] ukStates = {
                "England","Scotland","Wales","Northern Ireland"
            };
            return ukStates;
        }

        else if(countryName == "Netherlands"){
            String[] netherlandsStates = {
                "North Holland","South Holland","Utrecht",
                "Gelderland","Limburg","Friesland",
                "Drenthe","Overijssel","Flevoland","Groningen"
            };
            return netherlandsStates;
        }

        else if(countryName == "Switzerland"){
            String[] switzerlandStates = {
                "Zurich","Geneva","Bern","Lucerne",
                "Basel","Lausanne","Zug",
                "St Gallen","Ticino","Valais"
            };
            return switzerlandStates;
        }

        else if(countryName == "Saudi Arabia"){
            String[] saudiStates = {
                "Riyadh","Makkah","Madinah",
                "Eastern Province","Asir",
                "Tabuk","Hail","Jazan"
            };
            return saudiStates;
        }

        else if(countryName == "United Arab Emirates"){
            String[] uaeStates = {
                "Abu Dhabi","Dubai","Sharjah",
                "Ajman","Fujairah",
                "Ras Al Khaimah","Umm Al Quwain"
            };
            return uaeStates;
        }
		        else if(countryName == "Thailand"){
            String[] thailandStates = {
                "Bangkok","Chiang Mai","Phuket","Pattaya",
                "Krabi","Nonthaburi","Nakhon Ratchasima",
                "Udon Thani","Khon Kaen","Surat Thani"
            };
            return thailandStates;
        }

        else if(countryName == "Vietnam"){
            String[] vietnamStates = {
                "Hanoi","Ho Chi Minh City","Da Nang",
                "Hai Phong","Can Tho","Hue",
                "Quang Ninh","Binh Duong","Dong Nai","Nghe An"
            };
            return vietnamStates;
        }

        else if(countryName == "Malaysia"){
            String[] malaysiaStates = {
                "Johor","Kedah","Kelantan","Malacca",
                "Negeri Sembilan","Pahang","Penang",
                "Perak","Perlis","Sabah",
                "Sarawak","Selangor","Terengganu"
            };
            return malaysiaStates;
        }

        else if(countryName == "Singapore"){
            String[] singaporeStates = {
                "Central Region","North Region",
                "North-East Region","East Region","West Region"
            };
            return singaporeStates;
        }

        else if(countryName == "Philippines"){
            String[] philippinesStates = {
                "Luzon","Visayas","Mindanao",
                "Cebu","Davao","Manila",
                "Iloilo","Palawan","Bohol","Batangas"
            };
            return philippinesStates;
        }

        else if(countryName == "South Korea"){
            String[] southKoreaStates = {
                "Seoul","Busan","Incheon","Daegu",
                "Daejeon","Gwangju","Ulsan",
                "Gyeonggi","Gangwon","Jeju"
            };
            return southKoreaStates;
        }

        else if(countryName == "North Korea"){
            String[] northKoreaStates = {
                "Pyongyang","South Pyongan","North Pyongan",
                "Chagang","Ryanggang","South Hamgyong",
                "North Hamgyong","Kangwon","Hwanghae"
            };
            return northKoreaStates;
        }

        else if(countryName == "Turkey"){
            String[] turkeyStates = {
                "Istanbul","Ankara","Izmir",
                "Antalya","Bursa","Adana",
                "Konya","Gaziantep","Trabzon","Kayseri"
            };
            return turkeyStates;
        }

        else if(countryName == "Egypt"){
            String[] egyptStates = {
                "Cairo","Alexandria","Giza",
                "Luxor","Aswan","Port Said",
                "Suez","Dakahlia","Beheira","Minya"
            };
            return egyptStates;
        }

        else if(countryName == "Nigeria"){
            String[] nigeriaStates = {
                "Lagos","Abuja","Kano",
                "Kaduna","Rivers","Oyo",
                "Enugu","Borno","Katsina","Delta"
            };
            return nigeriaStates;
        }

        else if(countryName == "Kenya"){
            String[] kenyaStates = {
                "Nairobi","Mombasa","Kisumu",
                "Nakuru","Eldoret","Kiambu",
                "Machakos","Kajiado","Meru","Nyeri"
            };
            return kenyaStates;
        }

        else if(countryName == "Ethiopia"){
            String[] ethiopiaStates = {
                "Addis Ababa","Oromia","Amhara",
                "Tigray","Somali","Afar",
                "Sidama","Benishangul","Gambela","Harari"
            };
            return ethiopiaStates;
        }

        else if(countryName == "Morocco"){
            String[] moroccoStates = {
                "Casablanca","Rabat","Marrakesh",
                "Fes","Tangier","Agadir",
                "Meknes","Oujda","Kenitra","Tetouan"
            };
            return moroccoStates;
        }

        else if(countryName == "Algeria"){
            String[] algeriaStates = {
                "Algiers","Oran","Constantine",
                "Annaba","Blida","Batna",
                "Setif","Tlemcen","Bejaia","Skikda"
            };
            return algeriaStates;
        }

        else if(countryName == "Ghana"){
            String[] ghanaStates = {
                "Greater Accra","Ashanti","Western",
                "Eastern","Northern","Central",
                "Volta","Upper East","Upper West","Bono"
            };
            return ghanaStates;
        }

        else if(countryName == "Colombia"){
            String[] colombiaStates = {
                "Bogota","Antioquia","Valle del Cauca",
                "Cundinamarca","Santander","Bolivar",
                "Atlantico","Tolima","Huila","Meta"
            };
            return colombiaStates;
        }

        else if(countryName == "Peru"){
            String[] peruStates = {
                "Lima","Cusco","Arequipa",
                "La Libertad","Piura","Junin",
                "Puno","Loreto","Ancash","Tacna"
            };
            return peruStates;
        }

        else if(countryName == "Chile"){
            String[] chileStates = {
                "Santiago","Valparaiso","Biobio",
                "Araucania","Maule","Coquimbo",
                "Atacama","Los Lagos","Tarapaca","Magallanes"
            };
            return chileStates;
        }

        else if(countryName == "New Zealand"){
            String[] newZealandStates = {
                "Auckland","Wellington","Canterbury",
                "Otago","Waikato","Bay of Plenty",
                "Northland","Taranaki","Nelson","Southland"
            };
            return newZealandStates;
        }

        else if(countryName == "Ireland"){
            String[] irelandStates = {
                "Dublin","Cork","Galway",
                "Limerick","Waterford","Kerry",
                "Clare","Donegal","Mayo","Kildare"
            };
            return irelandStates;
        }
		        else if(countryName == "Sweden"){
            String[] swedenStates = {
                "Stockholm","Skane","Vastra Gotaland",
                "Uppsala","Orebro","Vasterbotten",
                "Norrbotten","Halland","Dalarna","Jonkoping"
            };
            return swedenStates;
        }

        else if(countryName == "Norway"){
            String[] norwayStates = {
                "Oslo","Viken","Vestland",
                "Rogaland","Trondelag","Nordland",
                "Troms","Innlandet","Agder","More og Romsdal"
            };
            return norwayStates;
        }

        else if(countryName == "Denmark"){
            String[] denmarkStates = {
                "Copenhagen","Zealand","Southern Denmark",
                "Central Denmark","North Denmark"
            };
            return denmarkStates;
        }

        else if(countryName == "Finland"){
            String[] finlandStates = {
                "Uusimaa","Pirkanmaa","Lapland",
                "Northern Ostrobothnia","Southwest Finland",
                "Satakunta","Kainuu","Central Finland"
            };
            return finlandStates;
        }

        else if(countryName == "Poland"){
            String[] polandStates = {
                "Mazovia","Lesser Poland","Silesia",
                "Greater Poland","Pomerania","Lodz",
                "Lubusz","Podlaskie","Lublin","Subcarpathia"
            };
            return polandStates;
        }

        else if(countryName == "Ukraine"){
            String[] ukraineStates = {
                "Kyiv","Lviv","Odessa",
                "Kharkiv","Dnipro","Zaporizhzhia",
                "Vinnytsia","Poltava","Chernihiv","Sumy"
            };
            return ukraineStates;
        }

        else if(countryName == "Greece"){
            String[] greeceStates = {
                "Attica","Central Macedonia","Crete",
                "Thessaly","Epirus","Peloponnese",
                "Western Greece","Ionian Islands",
                "North Aegean","South Aegean"
            };
            return greeceStates;
        }

        else if(countryName == "Portugal"){
            String[] portugalStates = {
                "Lisbon","Porto","Braga",
                "Coimbra","Faro","Setubal",
                "Aveiro","Leiria","Madeira","Azores"
            };
            return portugalStates;
        }

        else if(countryName == "Belgium"){
            String[] belgiumStates = {
                "Flanders","Wallonia","Brussels",
                "Antwerp","East Flanders",
                "West Flanders","Liege","Namur","Hainaut"
            };
            return belgiumStates;
        }

        else if(countryName == "Austria"){
            String[] austriaStates = {
                "Vienna","Salzburg","Tyrol",
                "Styria","Carinthia","Upper Austria",
                "Lower Austria","Vorarlberg","Burgenland"
            };
            return austriaStates;
        }

        else if(countryName == "Hungary"){
            String[] hungaryStates = {
                "Budapest","Pest","Borsod-Abauj-Zemplen",
                "Hajdu-Bihar","Szabolcs-Szatmar",
                "Baranya","Csongrad","Fejer","Győr-Moson"
            };
            return hungaryStates;
        }

        else if(countryName == "Czech Republic"){
            String[] czechStates = {
                "Prague","Central Bohemia","South Bohemia",
                "Plzen","Karlovy Vary","Liberec",
                "Hradec Kralove","Pardubice","Olomouc","Zlin"
            };
            return czechStates;
        }

        else if(countryName == "Romania"){
            String[] romaniaStates = {
                "Bucharest","Cluj","Timis",
                "Iasi","Constanta","Brasov",
                "Dolj","Prahova","Bihor","Arad"
            };
            return romaniaStates;
        }

        else if(countryName == "Bulgaria"){
            String[] bulgariaStates = {
                "Sofia","Plovdiv","Varna",
                "Burgas","Ruse","Stara Zagora",
                "Pleven","Sliven","Dobrich","Shumen"
            };
            return bulgariaStates;
        }

        else if(countryName == "Croatia"){
            String[] croatiaStates = {
                "Zagreb","Split-Dalmatia","Rijeka",
                "Osijek","Zadar","Dubrovnik",
                "Istria","Karlovac","Varazdin","Sibenik"
            };
            return croatiaStates;
        }

        else if(countryName == "Serbia"){
            String[] serbiaStates = {
                "Belgrade","Vojvodina","Nis",
                "Novi Sad","Kragujevac","Subotica",
                "Zrenjanin","Pancevo","Cacak","Leskovac"
            };
            return serbiaStates;
        }

        else if(countryName == "Slovakia"){
            String[] slovakiaStates = {
                "Bratislava","Kosice","Presov",
                "Zilina","Nitra","Trencin",
                "Banska Bystrica","Trnava"
            };
            return slovakiaStates;
        }

        else if(countryName == "Slovenia"){
            String[] sloveniaStates = {
                "Ljubljana","Maribor","Celje",
                "Kranj","Koper","Velenje",
                "Novo Mesto","Ptuj"
            };
            return sloveniaStates;
        }

        else if(countryName == "Iceland"){
            String[] icelandStates = {
                "Reykjavik","Southern Peninsula",
                "Westfjords","North Iceland",
                "East Iceland","South Iceland"
            };
            return icelandStates;
        }

        else if(countryName == "Luxembourg"){
            String[] luxembourgStates = {
                "Luxembourg District","Diekirch",
                "Grevenmacher"
            };
            return luxembourgStates;
        }
		        else if(countryName == "Qatar"){
            String[] qatarStates = {
                "Doha","Al Rayyan","Al Wakrah",
                "Al Khor","Umm Salal","Al Daayen",
                "Al Shamal","Al Sheehaniya"
            };
            return qatarStates;
        }

        else if(countryName == "Oman"){
            String[] omanStates = {
                "Muscat","Dhofar","Al Batinah",
                "Al Dakhiliyah","Al Sharqiyah",
                "Al Dhahirah","Musandam","Al Wusta"
            };
            return omanStates;
        }

        else if(countryName == "Kuwait"){
            String[] kuwaitStates = {
                "Al Asimah","Hawalli","Farwaniya",
                "Ahmadi","Jahra","Mubarak Al-Kabeer"
            };
            return kuwaitStates;
        }

        else if(countryName == "Bahrain"){
            String[] bahrainStates = {
                "Capital","Muharraq",
                "Northern","Southern"
            };
            return bahrainStates;
        }

        else if(countryName == "Israel"){
            String[] israelStates = {
                "Jerusalem","Tel Aviv",
                "Haifa","Central",
                "Southern","Northern"
            };
            return israelStates;
        }

        else if(countryName == "Jordan"){
            String[] jordanStates = {
                "Amman","Irbid","Zarqa",
                "Aqaba","Karak","Ma'an",
                "Madaba","Balqa","Jerash","Tafilah"
            };
            return jordanStates;
        }

        else if(countryName == "Iran"){
            String[] iranStates = {
                "Tehran","Isfahan","Fars",
                "Khorasan","Mazandaran","Gilan",
                "Khuzestan","Qom","Yazd","Kerman"
            };
            return iranStates;
        }

        else if(countryName == "Iraq"){
            String[] iraqStates = {
                "Baghdad","Basra","Nineveh",
                "Erbil","Sulaymaniyah","Diyala",
                "Karbala","Najaf","Kirkuk","Anbar"
            };
            return iraqStates;
        }

        else if(countryName == "Afghanistan"){
            String[] afghanistanStates = {
                "Kabul","Herat","Kandahar",
                "Balkh","Nangarhar","Kunduz",
                "Helmand","Badakhshan","Ghazni","Parwan"
            };
            return afghanistanStates;
        }

        else if(countryName == "Kazakhstan"){
            String[] kazakhstanStates = {
                "Almaty","Astana","Shymkent",
                "Karaganda","Aktobe","Pavlodar",
                "Atyrau","Kostanay","Mangystau","Turkistan"
            };
            return kazakhstanStates;
        }

        else if(countryName == "Uzbekistan"){
            String[] uzbekistanStates = {
                "Tashkent","Samarkand","Bukhara",
                "Namangan","Andijan","Fergana",
                "Khorezm","Navoi","Surkhandarya","Jizzakh"
            };
            return uzbekistanStates;
        }

        else if(countryName == "Turkmenistan"){
            String[] turkmenistanStates = {
                "Ashgabat","Ahal","Balkan",
                "Dashoguz","Lebap","Mary"
            };
            return turkmenistanStates;
        }

        else if(countryName == "Kyrgyzstan"){
            String[] kyrgyzstanStates = {
                "Bishkek","Osh","Chui",
                "Issyk-Kul","Jalal-Abad",
                "Naryn","Batken","Talas"
            };
            return kyrgyzstanStates;
        }

        else if(countryName == "Tajikistan"){
            String[] tajikistanStates = {
                "Dushanbe","Sughd","Khatlon",
                "Gorno-Badakhshan","Districts of Republican Subordination"
            };
            return tajikistanStates;
        }

        else if(countryName == "Mongolia"){
            String[] mongoliaStates = {
                "Ulaanbaatar","Arkhangai","Bayan-Olgii",
                "Bulgan","Darkhan-Uul","Dornod",
                "Khovd","Orkhon","Selenge","Tov"
            };
            return mongoliaStates;
        }

        else if(countryName == "Cambodia"){
            String[] cambodiaStates = {
                "Phnom Penh","Siem Reap","Battambang",
                "Kampot","Kampong Cham","Takeo",
                "Kandal","Preah Sihanouk","Kratie","Pursat"
            };
            return cambodiaStates;
        }

        else if(countryName == "Laos"){
            String[] laosStates = {
                "Vientiane","Luang Prabang","Savannakhet",
                "Champasak","Khammouane","Bokeo",
                "Oudomxay","Xieng Khouang"
            };
            return laosStates;
        }

        else if(countryName == "Myanmar"){
            String[] myanmarStates = {
                "Yangon","Mandalay","Shan",
                "Kachin","Rakhine","Mon",
                "Bago","Ayeyarwady","Sagaing","Chin"
            };
            return myanmarStates;
        }

        else if(countryName == "Brunei"){
            String[] bruneiStates = {
                "Brunei-Muara","Belait",
                "Tutong","Temburong"
            };
            return bruneiStates;
        }

        else if(countryName == "Maldives"){
            String[] maldivesStates = {
                "Male","Addu","Fuvahmulah",
                "Haa Alif","Haa Dhaalu",
                "Kaafu","Laamu","Raa"
            };
            return maldivesStates;
        }
		        else if(countryName == "Bhutan"){
            String[] bhutanStates = {
                "Thimphu","Paro","Punakha",
                "Wangdue Phodrang","Bumthang",
                "Trongsa","Mongar","Samdrup Jongkhar",
                "Trashigang","Chukha"
            };
            return bhutanStates;
        }

        else if(countryName == "Nepal"){
            String[] nepalStates = {
                "Koshi","Madhesh","Bagmati",
                "Gandaki","Lumbini",
                "Karnali","Sudurpashchim"
            };
            return nepalStates;
        }

        else if(countryName == "Madagascar"){
            String[] madagascarStates = {
                "Antananarivo","Toamasina","Fianarantsoa",
                "Mahajanga","Toliara","Antsiranana"
            };
            return madagascarStates;
        }

        else if(countryName == "Tanzania"){
            String[] tanzaniaStates = {
                "Dar es Salaam","Dodoma","Arusha",
                "Mwanza","Zanzibar","Mbeya",
                "Morogoro","Tanga","Kilimanjaro","Tabora"
            };
            return tanzaniaStates;
        }

        else if(countryName == "Uganda"){
            String[] ugandaStates = {
                "Kampala","Gulu","Mbarara",
                "Jinja","Arua","Masaka",
                "Mbale","Fort Portal","Lira","Soroti"
            };
            return ugandaStates;
        }

        else if(countryName == "Rwanda"){
            String[] rwandaStates = {
                "Kigali","Northern Province",
                "Southern Province","Eastern Province",
                "Western Province"
            };
            return rwandaStates;
        }

        else if(countryName == "Burundi"){
            String[] burundiStates = {
                "Bujumbura","Gitega","Ngozi",
                "Rutana","Muyinga","Kayanza",
                "Kirundo","Makamba","Cibitoke","Bubanza"
            };
            return burundiStates;
        }

        else if(countryName == "Namibia"){
            String[] namibiaStates = {
                "Windhoek","Erongo","Khomas",
                "Oshana","Oshikoto","Otjozondjupa",
                "Hardap","Karas","Kavango","Kunene"
            };
            return namibiaStates;
        }

        else if(countryName == "Botswana"){
            String[] botswanaStates = {
                "Gaborone","Francistown","Kgatleng",
                "Kweneng","Ngamiland","Central District",
                "Southern District","North-East","Chobe","Ghanzi"
            };
            return botswanaStates;
        }

        else if(countryName == "Mozambique"){
            String[] mozambiqueStates = {
                "Maputo","Beira","Nampula",
                "Tete","Sofala","Zambezia",
                "Inhambane","Gaza","Niassa","Cabo Delgado"
            };
            return mozambiqueStates;
        }

        else if(countryName == "Angola"){
            String[] angolaStates = {
                "Luanda","Benguela","Huambo",
                "Huila","Cabinda","Cunene",
                "Lunda Norte","Lunda Sul","Malanje","Uige"
            };
            return angolaStates;
        }

        else if(countryName == "Cameroon"){
            String[] cameroonStates = {
                "Yaounde","Douala","Adamawa",
                "Centre","East","Far North",
                "Littoral","North","Northwest","Southwest"
            };
            return cameroonStates;
        }

        else if(countryName == "Senegal"){
            String[] senegalStates = {
                "Dakar","Saint-Louis","Thiès",
                "Kaolack","Ziguinchor","Tambacounda",
                "Diourbel","Fatick","Kolda","Louga"
            };
            return senegalStates;
        }

        else if(countryName == "Ivory Coast"){
            String[] ivoryCoastStates = {
                "Abidjan","Yamoussoukro","Bouake",
                "Daloa","San Pedro","Korhogo",
                "Man","Gagnoa","Divo","Odienne"
            };
            return ivoryCoastStates;
        }

        else if(countryName == "Mali"){
            String[] maliStates = {
                "Bamako","Kayes","Koulikoro",
                "Sikasso","Segou","Mopti",
                "Tombouctou","Gao","Kidal"
            };
            return maliStates;
        }

        else if(countryName == "Niger"){
            String[] nigerStates = {
                "Niamey","Agadez","Diffa",
                "Dosso","Maradi","Tahoua",
                "Tillaberi","Zinder"
            };
            return nigerStates;
        }

        else if(countryName == "Sudan"){
            String[] sudanStates = {
                "Khartoum","Darfur","Kordofan",
                "Blue Nile","White Nile",
                "Red Sea","Gezira","Sennar","Kassala","River Nile"
            };
            return sudanStates;
        }

        else if(countryName == "South Sudan"){
            String[] southSudanStates = {
                "Juba","Central Equatoria","Eastern Equatoria",
                "Western Equatoria","Jonglei","Upper Nile",
                "Unity","Lakes","Warrap","Northern Bahr el Ghazal"
            };
            return southSudanStates;
        }
		        else if(countryName == "Somalia"){
            String[] somaliaStates = {
                "Mogadishu","Puntland","Somaliland",
                "Jubaland","Galmudug",
                "Hirshabelle","South West State"
            };
            return somaliaStates;
        }

        else if(countryName == "Eritrea"){
            String[] eritreaStates = {
                "Asmara","Anseba","Debub",
                "Gash-Barka","Maekel",
                "Northern Red Sea","Southern Red Sea"
            };
            return eritreaStates;
        }

        else if(countryName == "Djibouti"){
            String[] djiboutiStates = {
                "Djibouti City","Ali Sabieh",
                "Arta","Dikhil",
                "Obock","Tadjourah"
            };
            return djiboutiStates;
        }

        else if(countryName == "Central African Republic"){
            String[] carStates = {
                "Bangui","Bamingui-Bangoran",
                "Haute-Kotto","Lobaye",
                "Mbomou","Nana-Grebizi",
                "Ombella-M'Poko","Ouaka","Vakaga"
            };
            return carStates;
        }

        else if(countryName == "Chad"){
            String[] chadStates = {
                "N'Djamena","Batha","Borkou",
                "Chari-Baguirmi","Ennedi",
                "Guera","Kanem","Lac",
                "Logone Occidental","Mayo-Kebbi"
            };
            return chadStates;
        }

        else if(countryName == "Gabon"){
            String[] gabonStates = {
                "Libreville","Estuaire","Haut-Ogooue",
                "Moyen-Ogooue","Ngounie",
                "Nyanga","Ogooue-Ivindo",
                "Ogooue-Lolo","Woleu-Ntem"
            };
            return gabonStates;
        }

        else if(countryName == "Republic of the Congo"){
            String[] congoStates = {
                "Brazzaville","Bouenza","Cuvette",
                "Kouilou","Lekoumou",
                "Likouala","Niari","Plateaux",
                "Pool","Sangha"
            };
            return congoStates;
        }

        else if(countryName == "Democratic Republic of the Congo"){
            String[] drcStates = {
                "Kinshasa","Katanga","Kasai",
                "Ituri","Kivu","Maniema",
                "Equateur","Bas-Uele",
                "Haut-Katanga","Tanganyika"
            };
            return drcStates;
        }

        else if(countryName == "Sierra Leone"){
            String[] sierraLeoneStates = {
                "Freetown","Eastern Province",
                "Northern Province","Southern Province",
                "North Western Province"
            };
            return sierraLeoneStates;
        }

        else if(countryName == "Liberia"){
            String[] liberiaStates = {
                "Monrovia","Bong","Lofa",
                "Nimba","Grand Bassa",
                "Grand Cape Mount","Grand Gedeh",
                "Margibi","Maryland","Rivercess"
            };
            return liberiaStates;
        }

        else if(countryName == "Guinea"){
            String[] guineaStates = {
                "Conakry","Boke","Faranah",
                "Kankan","Kindia","Labe",
                "Mamou","Nzerekore"
            };
            return guineaStates;
        }

        else if(countryName == "Guinea-Bissau"){
            String[] guineaBissauStates = {
                "Bissau","Bafata","Biombo",
                "Bolama","Cacheu",
                "Gabu","Oio","Quinara","Tombali"
            };
            return guineaBissauStates;
        }

        else if(countryName == "Gambia"){
            String[] gambiaStates = {
                "Banjul","Kanifing",
                "Lower River","North Bank",
                "Upper River","West Coast"
            };
            return gambiaStates;
        }

        else if(countryName == "Togo"){
            String[] togoStates = {
                "Lome","Centrale",
                "Kara","Maritime",
                "Plateaux","Savanes"
            };
            return togoStates;
        }

        else if(countryName == "Benin"){
            String[] beninStates = {
                "Porto-Novo","Alibori",
                "Atakora","Atlantique",
                "Borgou","Collines",
                "Couffo","Donga",
                "Littoral","Mono"
            };
            return beninStates;
        }

        else if(countryName == "Mauritania"){
            String[] mauritaniaStates = {
                "Nouakchott","Adrar",
                "Assaba","Brakna",
                "Gorgol","Guidimaka",
                "Hodh Ech Chargui",
                "Hodh El Gharbi",
                "Inchiri","Tagant"
            };
            return mauritaniaStates;
        }

        else if(countryName == "Mauritius"){
            String[] mauritiusStates = {
                "Port Louis","Beau Bassin",
                "Curepipe","Quatre Bornes",
                "Vacoas-Phoenix","Riviere du Rempart",
                "Pamplemousses","Savanne"
            };
            return mauritiusStates;
        }

        else if(countryName == "Seychelles"){
            String[] seychellesStates = {
                "Victoria","Anse Boileau",
                "Anse Royale","Baie Lazare",
                "Bel Air","Cascade",
                "English River","Grand Anse"
            };
            return seychellesStates;
        }

        else if(countryName == "Comoros"){
            String[] comorosStates = {
                "Moroni","Grande Comore",
                "Anjouan","Moheli"
            };
            return comorosStates;
        }

        else if(countryName == "Equatorial Guinea"){
            String[] eqGuineaStates = {
                "Malabo","Annobon",
                "Bioko Norte","Bioko Sur",
                "Centro Sur","Kie-Ntem",
                "Litoral","Wele-Nzas"
            };
            return eqGuineaStates;
        }
		        else if(countryName == "Mexico"){
            String[] mexicoStates = {
                "Chihuahua","Jalisco","Puebla",
                "Guanajuato","Veracruz","Yucatan",
                "Sonora","Nuevo Leon","Oaxaca","Baja California"
            };
            return mexicoStates;
        }

        else if(countryName == "Guatemala"){
            String[] guatemalaStates = {
                "Guatemala City","Alta Verapaz",
                "Baja Verapaz","Chimaltenango",
                "Escuintla","Huehuetenango",
                "Izabal","Petén","Quetzaltenango","Zacapa"
            };
            return guatemalaStates;
        }

        else if(countryName == "Honduras"){
            String[] hondurasStates = {
                "Tegucigalpa","Atlantida",
                "Choluteca","Colon",
                "Comayagua","Copan",
                "Cortes","El Paraiso",
                "Francisco Morazan","Yoro"
            };
            return hondurasStates;
        }

        else if(countryName == "El Salvador"){
            String[] elSalvadorStates = {
                "San Salvador","Santa Ana",
                "San Miguel","La Libertad",
                "La Paz","Sonsonate",
                "Ahuachapan","Usulutan",
                "Cuscatlan","Chalatenango"
            };
            return elSalvadorStates;
        }

        else if(countryName == "Nicaragua"){
            String[] nicaraguaStates = {
                "Managua","Leon",
                "Masaya","Granada",
                "Chinandega","Matagalpa",
                "Esteli","Jinotega",
                "Rivas","Boaco"
            };
            return nicaraguaStates;
        }

        else if(countryName == "Costa Rica"){
            String[] costaRicaStates = {
                "San Jose","Alajuela",
                "Cartago","Heredia",
                "Guanacaste","Puntarenas","Limon"
            };
            return costaRicaStates;
        }

        else if(countryName == "Panama"){
            String[] panamaStates = {
                "Panama City","Colon",
                "Chiriqui","Cocle",
                "Darien","Herrera",
                "Los Santos","Veraguas","Bocas del Toro"
            };
            return panamaStates;
        }

        else if(countryName == "Cuba"){
            String[] cubaStates = {
                "Havana","Santiago de Cuba",
                "Camaguey","Holguin",
                "Granma","Matanzas",
                "Villa Clara","Ciego de Avila",
                "Pinar del Rio","Guantanamo"
            };
            return cubaStates;
        }

        else if(countryName == "Jamaica"){
            String[] jamaicaStates = {
                "Kingston","Saint Andrew",
                "Saint Catherine","Clarendon",
                "Manchester","Saint James",
                "Saint Ann","Westmoreland"
            };
            return jamaicaStates;
        }

        else if(countryName == "Haiti"){
            String[] haitiStates = {
                "Port-au-Prince","Artibonite",
                "Centre","Grand'Anse",
                "Nord","Nord-Est",
                "Nord-Ouest","Sud",
                "Sud-Est","Nippes"
            };
            return haitiStates;
        }

        else if(countryName == "Dominican Republic"){
            String[] drStates = {
                "Santo Domingo","Santiago",
                "La Vega","San Cristobal",
                "Puerto Plata","La Romana",
                "San Pedro de Macoris","Duarte",
                "Barahona","Azua"
            };
            return drStates;
        }

        else if(countryName == "Bahamas"){
            String[] bahamasStates = {
                "Nassau","Grand Bahama",
                "Abaco","Andros",
                "Bimini","Eleuthera",
                "Exuma","Long Island"
            };
            return bahamasStates;
        }

        else if(countryName == "Barbados"){
            String[] barbadosStates = {
                "Bridgetown","Christ Church",
                "Saint Andrew","Saint George",
                "Saint James","Saint John",
                "Saint Joseph","Saint Lucy",
                "Saint Michael","Saint Peter"
            };
            return barbadosStates;
        }

        else if(countryName == "Trinidad and Tobago"){
            String[] tntStates = {
                "Port of Spain","San Fernando",
                "Arima","Chaguanas",
                "Diego Martin","Penal-Debe",
                "Princes Town","Sangre Grande",
                "Siparia","Tobago"
            };
            return tntStates;
        }

        else if(countryName == "Venezuela"){
            String[] venezuelaStates = {
                "Caracas","Zulia",
                "Miranda","Carabobo",
                "Lara","Bolivar",
                "Aragua","Anzoategui",
                "Tachira","Merida"
            };
            return venezuelaStates;
        }

        else if(countryName == "Bolivia"){
            String[] boliviaStates = {
                "La Paz","Santa Cruz",
                "Cochabamba","Oruro",
                "Potosi","Tarija",
                "Beni","Pando","Chuquisaca"
            };
            return boliviaStates;
        }

        else if(countryName == "Paraguay"){
            String[] paraguayStates = {
                "Asuncion","Central",
                "Alto Parana","Itapua",
                "Caaguazu","Cordillera",
                "Guaira","Misiones",
                "San Pedro","Boqueron"
            };
            return paraguayStates;
        }

        else if(countryName == "Uruguay"){
            String[] uruguayStates = {
                "Montevideo","Canelones",
                "Maldonado","Salto",
                "Paysandu","Rivera",
                "Colonia","Tacuarembo",
                "Durazno","Rocha"
            };
            return uruguayStates;
        }

        else if(countryName == "Suriname"){
            String[] surinameStates = {
                "Paramaribo","Nickerie",
                "Wanica","Commewijne",
                "Saramacca","Marowijne",
                "Para","Brokopondo","Sipaliwini"
            };
            return surinameStates;
        }

        else if(countryName == "Guyana"){
            String[] guyanaStates = {
                "Georgetown","Barima-Waini",
                "Cuyuni-Mazaruni","Demerara-Mahaica",
                "East Berbice-Corentyne","Essequibo Islands-West Demerara",
                "Mahaica-Berbice","Pomeroon-Supenaam",
                "Potaro-Siparuni","Upper Takutu-Upper Essequibo"
            };
            return guyanaStates;
        }
		        else if(countryName == "Albania"){
            String[] albaniaStates = {
                "Tirana","Durres","Vlore",
                "Shkoder","Fier","Elbasan",
                "Korce","Berat","Lezhe","Gjirokaster"
            };
            return albaniaStates;
        }

        else if(countryName == "Armenia"){
            String[] armeniaStates = {
                "Yerevan","Aragatsotn","Ararat",
                "Armavir","Gegharkunik","Kotayk",
                "Lori","Shirak","Syunik","Tavush"
            };
            return armeniaStates;
        }

        else if(countryName == "Azerbaijan"){
            String[] azerbaijanStates = {
                "Baku","Ganja","Sumqayit",
                "Lankaran","Mingachevir","Shaki",
                "Shirvan","Nakhchivan","Quba","Khachmaz"
            };
            return azerbaijanStates;
        }

        else if(countryName == "Belarus"){
            String[] belarusStates = {
                "Minsk","Brest","Gomel",
                "Grodno","Mogilev","Vitebsk"
            };
            return belarusStates;
        }

        else if(countryName == "Bosnia and Herzegovina"){
            String[] bosniaStates = {
                "Sarajevo","Federation of Bosnia and Herzegovina",
                "Republika Srpska","Brcko District"
            };
            return bosniaStates;
        }

        else if(countryName == "Cyprus"){
            String[] cyprusStates = {
                "Nicosia","Limassol",
                "Larnaca","Paphos",
                "Famagusta","Kyrenia"
            };
            return cyprusStates;
        }

        else if(countryName == "Estonia"){
            String[] estoniaStates = {
                "Tallinn","Harju",
                "Tartu","Ida-Viru",
                "Parnu","Saare",
                "Viljandi","Rapla"
            };
            return estoniaStates;
        }

        else if(countryName == "Georgia"){
            String[] georgiaStates = {
                "Tbilisi","Adjara",
                "Imereti","Kakheti",
                "Kvemo Kartli","Samegrelo",
                "Shida Kartli","Guria"
            };
            return georgiaStates;
        }

        else if(countryName == "Latvia"){
            String[] latviaStates = {
                "Riga","Kurzeme",
                "Latgale","Vidzeme","Zemgale"
            };
            return latviaStates;
        }

        else if(countryName == "Lithuania"){
            String[] lithuaniaStates = {
                "Vilnius","Kaunas",
                "Klaipeda","Siauliai",
                "Panevezys","Alytus",
                "Marijampole","Telsiai"
            };
            return lithuaniaStates;
        }

        else if(countryName == "Malta"){
            String[] maltaStates = {
                "Valletta","Birkirkara",
                "Sliema","Mosta",
                "Qormi","Zabbar",
                "San Gwann","Fgura"
            };
            return maltaStates;
        }

        else if(countryName == "Moldova"){
            String[] moldovaStates = {
                "Chisinau","Balti",
                "Cahul","Comrat",
                "Orhei","Soroca",
                "Ungheni","Edinet"
            };
            return moldovaStates;
        }

        else if(countryName == "Montenegro"){
            String[] montenegroStates = {
                "Podgorica","Niksic",
                "Herceg Novi","Pljevlja",
                "Bijelo Polje","Budva",
                "Bar","Cetinje"
            };
            return montenegroStates;
        }

        else if(countryName == "North Macedonia"){
            String[] nmStates = {
                "Skopje","Bitola",
                "Kumanovo","Tetovo",
                "Prilep","Ohrid",
                "Strumica","Veles"
            };
            return nmStates;
        }

        else if(countryName == "San Marino"){
            String[] sanMarinoStates = {
                "San Marino","Acquaviva",
                "Borgo Maggiore","Chiesanuova",
                "Domagnano","Faetano",
                "Fiorentino","Montegiardino","Serravalle"
            };
            return sanMarinoStates;
        }

        else if(countryName == "Monaco"){
            String[] monacoStates = {
                "Monaco-Ville","Monte Carlo",
                "La Condamine","Fontvieille"
            };
            return monacoStates;
        }

        else if(countryName == "Andorra"){
            String[] andorraStates = {
                "Andorra la Vella","Canillo",
                "Encamp","Escaldes-Engordany",
                "La Massana","Ordino","Sant Julia de Loria"
            };
            return andorraStates;
        }

        else if(countryName == "Liechtenstein"){
            String[] liechtensteinStates = {
                "Vaduz","Balzers",
                "Eschen","Gamprin",
                "Mauren","Planken",
                "Ruggell","Schaan","Schellenberg","Triesen","Triesenberg"
            };
            return liechtensteinStates;
        }

        else if(countryName == "Vatican City"){
            String[] vaticanStates = {
                "Vatican City"
            };
            return vaticanStates;
        }

        else if(countryName == "Timor-Leste"){
            String[] timorStates = {
                "Dili","Baucau",
                "Bobonaro","Cova Lima",
                "Ermera","Lautem",
                "Liquica","Manatuto",
                "Oecusse","Viqueque"
            };
            return timorStates;
        }
		        else if(countryName == "Papua New Guinea"){
            String[] pngStates = {
                "Port Moresby","Morobe","Madang",
                "Eastern Highlands","Western Highlands",
                "Enga","Milne Bay","East Sepik",
                "West Sepik","New Ireland"
            };
            return pngStates;
        }

        else if(countryName == "Fiji"){
            String[] fijiStates = {
                "Suva","Nadi",
                "Lautoka","Ba",
                "Labasa","Nausori",
                "Levuka","Sigatoka"
            };
            return fijiStates;
        }

        else if(countryName == "Samoa"){
            String[] samoaStates = {
                "Apia","Aana",
                "Aiga-i-le-Tai","Atua",
                "Fa'asaleleaga","Gaga'emauga",
                "Palauli","Satupa'itea","Tuamasaga","Va'a-o-Fonoti"
            };
            return samoaStates;
        }

        else if(countryName == "Tonga"){
            String[] tongaStates = {
                "Nuku'alofa","Ha'apai",
                "Vava'u","Eua",
                "Ongo Niua"
            };
            return tongaStates;
        }

        else if(countryName == "Solomon Islands"){
            String[] solomonStates = {
                "Honiara","Guadalcanal",
                "Malaita","Western Province",
                "Choiseul","Isabel",
                "Makira-Ulawa","Rennell and Bellona",
                "Temotu","Central Province"
            };
            return solomonStates;
        }

        else if(countryName == "Vanuatu"){
            String[] vanuatuStates = {
                "Port Vila","Malampa",
                "Penama","Sanma",
                "Shefa","Tafea","Torba"
            };
            return vanuatuStates;
        }

        else if(countryName == "Micronesia"){
            String[] micronesiaStates = {
                "Palikir","Chuuk",
                "Kosrae","Pohnpei","Yap"
            };
            return micronesiaStates;
        }

        else if(countryName == "Palau"){
            String[] palauStates = {
                "Ngerulmud","Koror",
                "Airai","Melekeok",
                "Ngardmau","Ngchesar",
                "Ngaraard","Ngatpang","Ngaremlengui","Peleliu"
            };
            return palauStates;
        }

        else if(countryName == "Marshall Islands"){
            String[] marshallStates = {
                "Majuro","Ebeye",
                "Arno","Jaluit",
                "Kwajalein","Wotje",
                "Mili","Likiep"
            };
            return marshallStates;
        }

        else if(countryName == "Kiribati"){
            String[] kiribatiStates = {
                "Tarawa","Betio",
                "Abaiang","Abemama",
                "Aranuka","Kiritimati",
                "Maiana","Nonouti"
            };
            return kiribatiStates;
        }

        else if(countryName == "Tuvalu"){
            String[] tuvaluStates = {
                "Funafuti","Nanumea",
                "Nanumanga","Niutao",
                "Nui","Nukufetau",
                "Nukulaelae","Vaitupu"
            };
            return tuvaluStates;
        }

        else if(countryName == "Nauru"){
            String[] nauruStates = {
                "Yaren","Aiwo",
                "Anabar","Anetan",
                "Anibare","Baiti",
                "Boe","Buada",
                "Denigomodu","Ewa"
            };
            return nauruStates;
        }

        else if(countryName == "Afghanistan"){
            String[] afghanistanStates = {
                "Kabul","Herat","Kandahar",
                "Balkh","Nangarhar","Kunduz",
                "Helmand","Badakhshan","Ghazni","Parwan"
            };
            return afghanistanStates;
        }

        else if(countryName == "Lebanon"){
            String[] lebanonStates = {
                "Beirut","Mount Lebanon",
                "North Governorate","South Governorate",
                "Bekaa","Nabatieh"
            };
            return lebanonStates;
        }

        else if(countryName == "Syria"){
            String[] syriaStates = {
                "Damascus","Aleppo",
                "Homs","Hama",
                "Latakia","Tartus",
                "Raqqa","Deir ez-Zor",
                "Daraa","Idlib"
            };
            return syriaStates;
        }

        else if(countryName == "Sri Lanka"){
            String[] sriLankaStates = {
                "Western","Central","Southern",
                "Northern","Eastern",
                "North Western","North Central",
                "Uva","Sabaragamuwa"
            };
            return sriLankaStates;
        }

        else if(countryName == "North Korea"){
            String[] northKoreaStates = {
                "Pyongyang","South Pyongan",
                "North Pyongan","Chagang",
                "Ryanggang","South Hamgyong",
                "North Hamgyong","Kangwon","Hwanghae"
            };
            return northKoreaStates;
        }

        else if(countryName == "South Korea"){
            String[] southKoreaStates = {
                "Seoul","Busan",
                "Incheon","Daegu",
                "Daejeon","Gwangju",
                "Ulsan","Gyeonggi",
                "Gangwon","Jeju"
            };
            return southKoreaStates;
        }

        else if(countryName == "Taiwan"){
            String[] taiwanStates = {
                "Taipei","New Taipei",
                "Taichung","Tainan",
                "Kaohsiung","Keelung",
                "Hsinchu","Chiayi",
                "Yilan","Pingtung"
            };
            return taiwanStates;
        }
		
		else if(countryName == "Uruguay"){
		String[] uruguayStates = {
			"Artigas","Canelones","Cerro Largo","Colonia",
			"Durazno","Flores","Florida","Lavalleja",
			"Maldonado","Montevideo","Paysandu","Rio Negro",
			"Rivera","Rocha","Salto","San Jose","Soriano",
			"Tacuarembo","Treinta y Tres"
		};
		return uruguayStates;
		}
		
		else if(countryName == "Uzbekistan"){
		String[] uzbekistanStates = {
			"Andijan","Bukhara",
			"Fergana","Jizzakh","Khorezm","Namangan",
			"Navoiy","Qashqadaryo","Samarqand","Sirdaryo",
			"Surxondaryo","Tashkent","Karakalpakstan"
		};
		return uzbekistanStates;
		}
		
		else if(countryName == "Vanuatu"){
		String[] vanuatuStates = {
			"Malampa","Penama","Sanma",
			"Shefa","Tafea","Torba"};
		return vanuatuStates;
		}
		
		else if(countryName == "Vatican City"){
		String[] vaticanStates = {"Vatican City"};
		return vaticanStates;
		}
		
		else if(countryName == "Venezuela"){
		String[] venezuelaStates = {
			"Amazonas","Anzoategui","Apure",
			"Aragua","Barinas","Bolivar","Carabobo","Cojedes","Delta Amacuro",
			"Falcon","Guarico","Lara","Merida","Miranda","Monagas",
			"Nueva Esparta","Portuguesa","Sucre","Tachira",
			"Trujillo","Vargas","Yaracuy","Zulia"
		};
		return venezuelaStates;
		}
		
		else if(countryName == "Vietnam"){
		String[] vietnamStates = {
			"An Giang","Ba Ria-Vung Tau",
			"Bac Giang","Bac Kan","Bac Lieu","Bac Ninh",
			"Ben Tre","Binh Dinh","Binh Duong","Binh Phuoc",
			"Binh Thuan","Ca Mau","Can Tho","Cao Bang","Da Nang",
			"Dak Lak","Dong Nai","Dong Thap","Gia Lai","Ha Giang","Ha Nam"
		};
		return vietnamStates;
		}
		
		else if(countryName == "Yemen"){
		String[] yemenStates = {
			"Abyan","Aden","Al Bayda","Al Hudaydah",
			"Al Jawf","Al Mahrah","Al Mahwit","Amanat Al Asimah",
			"Amran","Dhamar","Hadhramaut","Hajjah",
			"Ibb","Lahij","Marib","Raymah","Saada",
			"Sana'a","Shabwah","Socotra","Taiz"
		};
		return yemenStates;
		}
		
		else if(countryName == "Zambia"){
		String[] zambiaStates = {
			"Central","Copperbelt","Eastern","Luapula",
			"Lusaka","Muchinga","Northern","North-Western",
			"Southern","Western"
		};
		return zambiaStates;
		}
		
		else if(countryName == "Zimbabwe"){
		String[] zimbabweStates = {"Bulawayo","Harare",
			"Manicaland","Mashonaland Central","Mashonaland East",
			"Mashonaland West","Masvingo","Matabeleland North",
			"Matabeleland South","Midlands"
		};
		return zimbabweStates;
		}
		
		else if(countryName == "Palestine"){
		String[] palestineStates = {
			"Bethlehem","Deir al-Balah","Gaza","Hebron",
			"Jenin","Jericho","Jerusalem","Khan Yunis",
			"Nablus","Qalqilya","Rafah","Ramallah",
			"Salfit","Tubas","Tulkarm"};
		return palestineStates;
		}

        else{
            System.out.println("Country not found....");
            return null;
        }
    }

    public static void getStates(String[] states){

	System.out.println("\n---Fetching States Names---\n");
	
        for(String state : states){
            System.out.println(state);
        }
			
        System.out.println("----States lists are here-----");
    }
}