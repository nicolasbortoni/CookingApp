package com.utn.cookingapp.entities

class RecipeRepository {
    var recipeRepository : MutableList<Recipe> = mutableListOf()

    init {
        recipeRepository.add(Recipe("112","Salsa Bologñesa","Pedro","La boloñesa o bolognesa es una salsa muy comúnmente usada para acompañar pastas o a la típica polenta. Es una salsa espesa, de color marrón-rojo, muy empleada en las comarcas cercanas a Bolonia."))
        recipeRepository.add(Recipe("113","Pan de masa madre","Juan","La masa madre es un pan elaborado mediante la fermentación de masa utilizando lactobacilaceas silvestres y levadura. El ácido láctico de la fermentación imparte un sabor amargo y mejora las cualidades de conservación."))
        recipeRepository.add(Recipe("114","Pizza napolitana","Tomi","La pizza napolitana, de masa tierna y delgada pero bordes altos, es la versión propia de la cocina napolitana de la pizza redonda. El término pizza napoletana, por su importancia histórica o regional, se emplea en algunas zonas como sinónimo de pizza tonda.La pizza napolitana, de masa tierna y delgada pero bordes altos, es la versión propia de la cocina napolitana de la pizza redonda. El término pizza napoletana, por su importancia histórica o regional, se emplea en algunas zonas como sinónimo de pizza tonda."))
        recipeRepository.add(Recipe("115","Lasagna","Teo","La lasaña es un tipo de pasta. Se suele servir en láminas superpuestas intercaladas con capas de ingredientes al gusto, más frecuentemente carne en salsa boloñesa y bechamel. Su origen es italiano y el plato preparado usualmente con carne suele llamarse lasaña al horno."))
        recipeRepository.add(Recipe("116","Wok","Ailin","El wok (kuo en el idioma mandarín) es un utensilio de cocina originario de China. Podríamos decir que es una especie de sartén ligera, redonda, profunda y con asas. El tamaño medio suele ser de 30 cm o más de diámetro. Suele estar hecha de acero, hierro fundido e incluso se encuentran ejemplares de aluminio."))
        recipeRepository.add(Recipe("117","Asado","Mica","El asado, barbacoa, parrilla o parrillada es una técnica de cocción mediante la cual, los alimentos son expuestos al calor de fuego o brasas para que se cocinen lentamente. El calor se transmite gradualmente al alimento, que por lo general está suspendido sobre el fuego o cerca de las brasas."))
        recipeRepository.add(Recipe("118","Chipá","Alan","Chipa o chipá es un vocablo que proviene del guaraní. Según la grafía actual, en guaraní está palabra se escribe «chipa» y se pronuncia parecido a [shipá]. Este es un alimento cuya preparación más tradicional es a base de almidón/fécula de mandioca y queso semiduro."))
        recipeRepository.add(Recipe("119","Volcancitos","Ale","Coulant, fondant o volcán es un conocido postre de chocolate patentado por el chef Francés Michel Bras en 1981 en su restaurante de Laguiole, en la meseta de l'Aubrac, al suroeste de Francia. Se presenta como pequeño bizcocho de chocolate con el interior fundido. "))
        recipeRepository.add(Recipe("120","Bizcochuelo","Juan","El bizcocho, queque o torta es un pan dulce cuya miga es elástica y esponjosa, y su corteza es fina, tostada pero nada dura, y que es una masa básica de la repostería, pues sirve de base para innumerables tartas."))
        recipeRepository.add(Recipe("121","Fideos","Nico","Los fideos, a veces conocidos por su nombre en inglés, noodles, son un tipo de pasta con forma alargada."))
        recipeRepository.add(Recipe("122","Estofado","Rubén","Un estofado es un proceso culinario de cocción de un alimento, el cual es sometido a fuego lento en un recipiente cerrado. El guiso realizado mediante esta técnica culinaria evita la evaporación manteniendo gran parte de los jugos iniciales y reteniendo de esta forma los sabores y aromas de los alimentos cocinados."))
        recipeRepository.add(Recipe("123","Milanesa","Sofia","La milanesa es un filete, normalmente de carne vacuna, rebozado, que se cocina frito o al horno. Por extensión, se llama milanesa a cualquier rebanada de un ingrediente rebozado y cocido de cierta manera."))
        recipeRepository.add(Recipe("124","Locro","Leila","El locro es una especie de guiso de origen prehispánico y preincaico, típico de varios pueblos andinos, a base de zapallo, maíz (especialmente blanco) y papas, originario del área de la cordillera de los Andes, en Argentina, Perú, Chile, Ecuador, Bolivia, Paraguay y el suroccidente colombiano."))
        recipeRepository.add(Recipe("125","Guiso de lentejas","Andrea","Egipcios, fenicios y griegos confiaron en estas legumbres como reserva en tiempos de escasez de trigo. Los antiguos judíos las valoraban tanto, que Esaú fue capaz de vender su primogenitura por un plato de reconstituyentes lentejas."))
    }

    fun getRecipes() : MutableList<Recipe>{
        return recipeRepository
    }
}