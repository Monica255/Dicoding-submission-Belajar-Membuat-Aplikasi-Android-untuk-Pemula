package com.example.movies

object MoviesData {
    private val movieNames = arrayOf("Bichon Frise",
        "Boxer",
        "German Shepherd",
        "Labrador Retriever",
        "Pit bull",
        "Pointer",
        "Pug",
        "Rottweiler",
        "Jack Russell Terrier",
        "Shiba Inu")

    private val movieDetails = arrayOf("Bichon Frise adalah ras anjing kecil berbulu putih halus yang berasal dari Pulau Malta, Spanyol. Ras anjing ini termasuk jenis anjing Bichon yang kemudian dibedakan menjadi empat ras berbeda, yaitu Bichon Bolognese, Bichon Havanais, Bichon Maltese, dan Bichon Tenerife.",
        "Boxer ialah salah satu ras murni anjing. Dalam klasifikasi anjing ras, Boxer termasuk kelompok anjing pelacak. Mereka kuat dan sanggup berlari di ruang terbuka dalam rentang waktu yang panjang. Anjing ini disebut demikian karena ia menggunakan kaki depannya untuk memukul bila sedang berkelahi.",
        "Anjing Gembala Jerman adalah salah satu ras murni anjing yang populer. Ukurannya besar, dikenal cerdas namun penurut. Anjing ini relatif tidak memiliki variasi warna, yaitu coklat dengan variasi hitam. Dahulu, anjing Gembala Jerman sering digunakan untuk menggembalakan domba.",
        "Labrador Retriever Canis familiaris adalah salah satu dari beberapa jenis anjing pemungut buruan dan salah satu anjing ras terpopuler di dunia karena enerjik, pandai, dan bersahabat sehingga cocok dijadikan anjing pekerja. Labrador Retriever terkenal pintar dan cepat belajar, serta senang dipuji dan diperhatikan.",
        "Pit bull adalah nama umum untuk jenis anjing yang diturunkan dari bulldog dan terrier. Jenis pit bull sangat ambigu karena mencakup berbagai keturunan, jenis informal dan penampilan yang tidak dapat diidentifikasi secara andal. ",
        "Pointer merupakan anjing yang ramah, bahkan temperamen dan kewaspadaan yang baik membuatnya menjadi teman yang menyenangkan dan bisa dilatih baik di lapangan maupun di rumah.  Pointer juga telah dikenal unggul dalam pekerjaan layanan, terapi, melakukan pencarian dan penyelamatan.",
        "Pug adalah ras anjing dengan wajah yang berkerut, moncong yang pendek, tubuh berukuran sedang, dan ekor yang melingkar. Anjing pug juga memiliki berbagai warna, dengan warna yang paling umum adalah warna hitam dan coklat muda kekuningan.",
        "Rottweiler adalah jenis anjing domestik, dianggap menengah-ke-besar atau besar. Anjing-anjing itu dikenal dalam bahasa Jerman sebagai Rottweiler Metzgerhund, yang berarti anjing penjagal Rottweil, karena kegunaan utamanya adalah untuk menggembalakan ternak dan menarik gerobak berisi daging yang dipotong ke pasar. ",
        "Jack Russell Terrier adalah ras anjing yang memiliki kemampuan eksplorasi dan berburu yang tinggi. Ras anjing ini merupakan hasil persilangan yang dilakukan oleh Parson John Russel di Devonshire, Inggris. Ketika Russel bersekolah di Oxford, dia meluangkan banyak waktu untuk berburu rubah.",
        "Shiba Inu adalah anjing asli Jepang yang sudah ada sejak zaman kuno. Shiba Inu merupakan anjing ras paling populer di Jepang. Tipe anjing berukuran sedang, tinggi badan jantan sekitar 38 cm hingga 41 cm, sedangkan tinggi badan betina sekitar 35 cm hingga 38 cm.")

    /*private val movieDetails = arrayOf("Annette is a 2021 musical psychological drama film directed by Leos Carax (in his English-language debut), and with a screenplay by Ron Mael and Russell Mael of Sparks, and Carax, from an original story, music and songs by the band. The plot follows a stand-up comedian (Adam Driver) and his opera singer wife (Marion Cotillard) and how their lives are changed when they have their first child. Simon Helberg and Devyn McDowell also starred.",
        "Escape Room: Tournament of Champions (released in some markets as Escape Room: No Way Out) is a 2021 American psychological horror film directed by Adam Robitel and written by Will Honley, Maria Melnik, Daniel Tuch, and Oren Uziel. A sequel to 2019\'s Escape Room, it stars Taylor Russell, Logan Miller, and Deborah Ann Woll reprising their roles from the first film, alongside new cast members Indya Moore, Holland Roden, Thomas Cocquerel, and Carlito Olivero, and follows a group of six people trying to survive a new series of more deadly escape rooms.",
        "Land And Sea Is An Unceasingly Bleak Story : NPR. Land And Sea Is An Unceasingly Bleak Story Katy Simpson Smith's debut novel, The Story of Land and Sea, is a story of suffering centered on an ex-pirate and his daughter just after the American Revolution.",
        "Set on the Italian Riviera, the film centers on Luca Paguro, a young sea monster boy with the ability to assume human form while on land, who explores the town of Portorosso with his new best friend, Alberto Scorfano, experiencing a life-changing summer adventure. Luca takes inspiration from Casarosa\'s childhood in Genoa; several Pixar artists were sent to the Italian Riviera gathering research from Italian culture and environment.",
        "Old is a 2021 American thriller film written, directed, and produced by M. Night Shyamalan. It is based on the French-language Swiss graphic novel Sandcastle by Pierre Oscar Levy and Frederik Peeters. The film features an ensemble cast consisting of Gael García Bernal, Vicky Krieps, Rufus Sewell, Alex Wolff, Thomasin McKenzie, Abbey Lee, Nikki Amuka-Bird, Ken Leung, Eliza Scanlen, Aaron Pierre, Embeth Davidtz, and Emun Elliott. The plot follows a group of people who find themselves aging rapidly on a secluded beach.",
        "The Restless (French: Les Intranquilles) is a 2021 international co-production drama film directed by Joachim Lafosse, starring Leïla Bekhti and Damien Bonnard. It revolves around Damien and Leïla, a couple in love as they battle with his bipolar disorder. In June 2021, the film was selected to compete for the Palme d'Or at the 2021 Cannes Film Festival.",
        "Spider-Man: Homecoming is a 2017 American superhero film based on the Marvel Comics character Spider-Man, co-produced by Columbia Pictures and Marvel Studios, and distributed by Sony Pictures Releasing. It is the second Spider-Man film reboot and the 16th film in the Marvel Cinematic Universe (MCU). The film was directed by Jon Watts, from a screenplay by the writing teams of Jonathan Goldstein and John Francis Daley, Watts and Christopher Ford, and Chris McKenna and Erik Sommers.",
        "Tom & Jerry (marketed as Tom & Jerry: The Movie) is a 2021 American live-action/computer-animated slapstick comedy film based on the titular cartoon characters of the same name created by William Hanna and Joseph Barbera, produced by the Warner Animation Group and distributed by Warner Bros. Pictures. It is the second theatrical film based on the characters following 1992\'s Tom and Jerry: The Movie. The film\'s story follows Tom enlisted to get rid of Jerry, before his presence threatens New York City\'s fanciest hotel and its important wedding set to take place on the hotel grounds.",
        "As animated features go, The Addams Family is bright, silly, goofy and downright hilarious at times, just as you\'d expect it to be, but it is also empathetically thoughtful and socially aware, a movie as apt to amuse as it is to put forward some sage social commentary, imbuing it with strength and substance to go along with the lovable peculiarity that percolates through the film from heartfelt but loopy start to winningly upbeat but weird finish.",
        "Vivo is a 2021 American computer-animated musical comedy film produced by Sony Pictures Animation. The film is directed by Kirk DeMicco and co-directed by Brandon Jeffords, from a screenplay by DeMicco and Quiara Alegría Hudes, and a story that was based on an original idea by Peter Barsocchini; with songs written by Lin-Manuel Miranda, who voices the title character in the film.")
*/
    private val moviesImages = intArrayOf(R.drawable.bichon2,
        R.drawable.boxer2,
        R.drawable.german2,
        R.drawable.labrador2,
        R.drawable.pitbull2,
        R.drawable.pointer2,
        R.drawable.pug2,
        R.drawable.rottweiler2,
        R.drawable.russell2,
        R.drawable.shiba2)

    private val moviesImages2 = intArrayOf(R.drawable.bichon,
        R.drawable.boxer,
        R.drawable.german,
        R.drawable.labrador,
        R.drawable.pitbull,
        R.drawable.pointer,
        R.drawable.pug,
        R.drawable.rottweiler,
        R.drawable.russell,
        R.drawable.shiba)

    val listData: ArrayList<Movie>
        get() {
            val list = arrayListOf<Movie>()
            for (position in movieNames.indices) {
                val movie = Movie()
                movie.name = movieNames[position]
                movie.detail = movieDetails[position]
                movie.photo = moviesImages[position]
                movie.poster = moviesImages2[position]
                list.add(movie)
            }
            return list
        }
}