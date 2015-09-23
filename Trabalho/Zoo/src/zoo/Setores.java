package zoo;

import java.util.*;
import static zoo.Background.quadroF;

public class Setores {

    //Setores

    static ArrayList<Mamifero> setorM = new ArrayList<Mamifero>();
    static ArrayList<Reptil> setorR = new ArrayList<Reptil>();
    static ArrayList<Ave> setorAv = new ArrayList<Ave>();
    static ArrayList<Anfibio> setorAn = new ArrayList<Anfibio>();
    static ArrayList<Invertebrado> setorI = new ArrayList<Invertebrado>();

    static ArrayList<Mamifero> duplicateM = new ArrayList<Mamifero>();
    static ArrayList<Reptil> duplicateR = new ArrayList<Reptil>();
    static ArrayList<Ave> duplicateAv = new ArrayList<Ave>();
    static ArrayList<Anfibio> duplicateAn = new ArrayList<Anfibio>();
    static ArrayList<Invertebrado> duplicateI = new ArrayList<Invertebrado>();

    public static void init() {
        /*==================================================================================================*/
        setorM.add(new Mamifero("Zeca", "leão", Animal.MACHO, "carnivoro", 12, "É o maior carnívoro africano. Apresenta dimorfismo sexual, o macho é maior e mais pesado que a fêmea e exibe uma extensa juba que se começa a evidenciar a partir dos 3 anos de idade. Ambos, exibem um tufo de pêlos na ponta da cauda, que utilizam na comunicação entre o grupo, além de expressões corporais e vocalizações."));
        setorM.add(new Mamifero("Luna", "leão", Animal.FEMEA, "carnivoro", 14, "É o maior carnívoro africano. Apresenta dimorfismo sexual, o macho é maior e mais pesado que a fêmea e exibe uma extensa juba que se começa a evidenciar a partir dos 3 anos de idade. Ambos, exibem um tufo de pêlos na ponta da cauda, que utilizam na comunicação entre o grupo, além de expressões corporais e vocalizações."));
        setorM.add(new Mamifero("Luan", "macaco", Animal.FEMEA, "onivoro", 12, "O macho é ligeiramente maior do que a fêmea. A pelagem é negra, relativamente longa e, geralmente, ambos os sexos apresentam uma barba branca. As crias nascem com a pele rosada na face e nas mãos e com um tufo caudal de pelos brancos, que desaparece até à idade adulta."));
        setorM.add(new Mamifero("Zeca2", "macaco", Animal.FEMEA, "onivoro", 4, "O macho é ligeiramente maior do que a fêmea. A pelagem é negra, relativamente longa e, geralmente, ambos os sexos apresentam uma barba branca. As crias nascem com a pele rosada na face e nas mãos e com um tufo caudal de pelos brancos, que desaparece até à idade adulta."));
        setorM.add(new Mamifero("Zeca3", "girafa", Animal.FEMEA, "herbivoro", 62, "A cor e o padrão da pelagem variam conforme a zona geográfica. É o animal mais alto do Mundo, só o seu pescoço pode medir 2 m. Nos machos, as formações córneas revestidas por pele no topo da cabeça, são antecedidas por uma pequena proeminência no meio da fronte."));
        setorM.add(new Mamifero("Zeca1", "girafa", Animal.MACHO, "herbivoro", 16, "A cor e o padrão da pelagem variam conforme a zona geográfica. É o animal mais alto do Mundo, só o seu pescoço pode medir 2 m. Nos machos, as formações córneas revestidas por pele no topo da cabeça, são antecedidas por uma pequena proeminência no meio da fronte."));
        setorM.add(new Mamifero("Zeca4", "jaguar", Animal.MACHO, "carnivoro", 1, "É o maior felino do continente americano. O tamanho dos indivíduos varia com a localização geográfica da população. Distingue-se pelo padrão da pelagem com grandes rosetas negras com pequenas pintas, também negras, no centro. Os animais melânicos (com pelagem totalmente negra) são frequentes."));
        setorM.add(new Mamifero("Zeca5", "jaguar", Animal.FEMEA, "carnivoro", 22, "É o maior felino do continente americano. O tamanho dos indivíduos varia com a localização geográfica da população. Distingue-se pelo padrão da pelagem com grandes rosetas negras com pequenas pintas, também negras, no centro. Os animais melânicos (com pelagem totalmente negra) são frequentes."));
        setorM.add(new Mamifero("Zeca6", "chita", Animal.MACHO, "carnivoro", 3, "É o mamífero terrestre mais rápido do Mundo em curtas distâncias. Distingue-se pelo corpo esguio e pela linha negra em forma de lágrima, do canto de cada olho até à boca. O macho é maior do que a fêmea. Contrariamente à maioria dos felinos, tem garras expostas, fundamentais para a corrida em velocidade."));
        setorM.add(new Mamifero("Zeca7", "chita", Animal.FEMEA, "carnivoro", 5, "É o mamífero terrestre mais rápido do Mundo em curtas distâncias. Distingue-se pelo corpo esguio e pela linha negra em forma de lágrima, do canto de cada olho até à boca. O macho é maior do que a fêmea. Contrariamente à maioria dos felinos, tem garras expostas, fundamentais para a corrida em velocidade."));
        setorM.add(new Mamifero("Zeca8", "macaco", Animal.FEMEA, "onivoro", 6, "O macho é ligeiramente maior do que a fêmea. A pelagem é negra, relativamente longa e, geralmente, ambos os sexos apresentam uma barba branca. As crias nascem com a pele rosada na face e nas mãos e com um tufo caudal de pelos brancos, que desaparece até à idade adulta."));
        setorM.add(new Mamifero("Zeca9", "macaco", Animal.MACHO, "onivoro", 7, "O macho é ligeiramente maior do que a fêmea. A pelagem é negra, relativamente longa e, geralmente, ambos os sexos apresentam uma barba branca. As crias nascem com a pele rosada na face e nas mãos e com um tufo caudal de pelos brancos, que desaparece até à idade adulta."));
        setorM.add(new Mamifero("Zeca0", "macaco", Animal.FEMEA, "onivoro", 8, "O macho é ligeiramente maior do que a fêmea. A pelagem é negra, relativamente longa e, geralmente, ambos os sexos apresentam uma barba branca. As crias nascem com a pele rosada na face e nas mãos e com um tufo caudal de pelos brancos, que desaparece até à idade adulta."));
        setorM.add(new Mamifero("Zecaq", "macaco", Animal.MACHO, "onivoro", 9, "O macho é ligeiramente maior do que a fêmea. A pelagem é negra, relativamente longa e, geralmente, ambos os sexos apresentam uma barba branca. As crias nascem com a pele rosada na face e nas mãos e com um tufo caudal de pelos brancos, que desaparece até à idade adulta."));
        setorM.add(new Mamifero("Zecaw", "elefante", Animal.MACHO, "herbivoro", 5, "É o maior animal terrestre, sendo o macho maior do que a fêmea. A inconfundível tromba é formada pelo nariz e lábio superior. A pele é espessa e quase desprovida de pelos. Dentes incisivos superiores crescem ao longo de toda a vida do animal. As orelhas são muito grandes e com funções de regulação de temperatura entre outras."));
        setorM.add(new Mamifero("Zecae", "elefante", Animal.FEMEA, "herbivoro", 42, "É o maior animal terrestre, sendo o macho maior do que a fêmea. A inconfundível tromba é formada pelo nariz e lábio superior. A pele é espessa e quase desprovida de pelos. Dentes incisivos superiores crescem ao longo de toda a vida do animal. As orelhas são muito grandes e com funções de regulação de temperatura entre outras."));
        setorM.add(new Mamifero("Zecar", "adax", Animal.MACHO, "herbivoro", 32, "Ambos os sexos têm um tufo de pelos castanhos na fronte e cornos. A pelagem de verão é branca e a de inverno tem um tom acastanhado. É o antílope melhor adaptado ao deserto, onde caminha facilmente com a ajuda de cascos largos na base."));
        setorM.add(new Mamifero("Zecat", "adax", Animal.FEMEA, "herbivoro", 12, "Ambos os sexos têm um tufo de pelos castanhos na fronte e cornos. A pelagem de verão é branca e a de inverno tem um tom acastanhado. É o antílope melhor adaptado ao deserto, onde caminha facilmente com a ajuda de cascos largos na base."));
        setorM.add(new Mamifero("Zecay", "foca", Animal.MACHO, "carnivoro", 12, "Tal como os restantes mamíferos marinhos, possui uma espessa camada de gordura sob a pele, como adaptação ao frio. Apresenta narinas em “V” e, ao contrário dos Leões-marinhos não tem orelhas, apresenta apenas ouvido interno. Quando em terra produz um muco protetor para os olhos e arrasta o abdómen para se deslocar."));
        setorM.add(new Mamifero("Zecau", "foca", Animal.FEMEA, "carnivoro", 12, "Tal como os restantes mamíferos marinhos, possui uma espessa camada de gordura sob a pele, como adaptação ao frio. Apresenta narinas em “V” e, ao contrário dos Leões-marinhos não tem orelhas, apresenta apenas ouvido interno. Quando em terra produz um muco protetor para os olhos e arrasta o abdómen para se deslocar."));
        setorM.add(new Mamifero("Zecai", "foca", Animal.MACHO, "carnivoro", 12, "Tal como os restantes mamíferos marinhos, possui uma espessa camada de gordura sob a pele, como adaptação ao frio. Apresenta narinas em “V” e, ao contrário dos Leões-marinhos não tem orelhas, apresenta apenas ouvido interno. Quando em terra produz um muco protetor para os olhos e arrasta o abdómen para se deslocar."));
        setorM.add(new Mamifero("Zecao", "hipopotamo", Animal.FEMEA, "herbivoro", 12, "A pele quase nua é protegida por uma secreção glandular avermelhada. Os dentes caninos crescem ao longo da vida do animal e podem atingir os 60-80 cm. A colocação no topo da cabeça dos olhos, orelhas e narinas, e os dedos unidos por membranas, são algumas adaptações à vida semiaquática."));
        setorM.add(new Mamifero("Zecap", "hipopotamo", Animal.MACHO, "herbivoro", 12, "A pele quase nua é protegida por uma secreção glandular avermelhada. Os dentes caninos crescem ao longo da vida do animal e podem atingir os 60-80 cm. A colocação no topo da cabeça dos olhos, orelhas e narinas, e os dedos unidos por membranas, são algumas adaptações à vida semiaquática."));
        setorM.add(new Mamifero("Zecaa", "koala", Animal.MACHO, "herbivoro", 12, "O nariz é grande e desprovido de pelo, ficando mais rosado com a idade. Nas patas anteriores, o polegar e o dedo seguinte são oponíveis. A fêmea tem bolsa marsupial, ventral com abertura vertical. Os animais das populações mais a sul podem ter o dobro do tamanho dos que vivem a norte."));
        setorM.add(new Mamifero("Zecas", "koala", Animal.FEMEA, "herbivoro", 12, "O nariz é grande e desprovido de pelo, ficando mais rosado com a idade. Nas patas anteriores, o polegar e o dedo seguinte são oponíveis. A fêmea tem bolsa marsupial, ventral com abertura vertical. Os animais das populações mais a sul podem ter o dobro do tamanho dos que vivem a norte."));
        setorM.add(new Mamifero("Zecad", "leão-marinho", Animal.FEMEA, "carnivoro", 12, "Os animais adultos têm coloração escura no dorso e dourada no peito. O macho, claramente maior do que a fêmea, distingue-se pela cabeça e pescoço maciços e pelo nariz caracteristicamente “arrebitado”. Tem orelhas visíveis e vibrissas (bigodes)."));
        setorM.add(new Mamifero("Zecaf", "leão-marinho", Animal.MACHO, "carnivoro", 12, "Os animais adultos têm coloração escura no dorso e dourada no peito. O macho, claramente maior do que a fêmea, distingue-se pela cabeça e pescoço maciços e pelo nariz caracteristicamente “arrebitado”. Tem orelhas visíveis e vibrissas (bigodes)."));
        setorM.add(new Mamifero("Zecag", "golfinho", Animal.FEMEA, "piscivoro", 12, "O macho é maior do que a fêmea e os animais que vivem ao largo tendem também a ser maiores e mais robustos do que os animais costeiros. Tem uma camada grossa de gordura debaixo da pele que o ajuda a manter a temperatura corporal. Respira por pulmões e o espiráculo, no cimo da cabeça, facilita a respiração à superfície."));
        setorM.add(new Mamifero("Zecah", "golfinho", Animal.FEMEA, "piscivoro", 12, "O macho é maior do que a fêmea e os animais que vivem ao largo tendem também a ser maiores e mais robustos do que os animais costeiros. Tem uma camada grossa de gordura debaixo da pele que o ajuda a manter a temperatura corporal. Respira por pulmões e o espiráculo, no cimo da cabeça, facilita a respiração à superfície."));
        setorM.add(new Mamifero("Zecaj", "golfinho", Animal.MACHO, "piscivoro", 12, "O macho é maior do que a fêmea e os animais que vivem ao largo tendem também a ser maiores e mais robustos do que os animais costeiros. Tem uma camada grossa de gordura debaixo da pele que o ajuda a manter a temperatura corporal. Respira por pulmões e o espiráculo, no cimo da cabeça, facilita a respiração à superfície."));
        /*==================================================================================================*/
        setorAv.add(new Ave("Pituco", "Arara-azul-e-amarela", Animal.MACHO, "frugivoro", 12, "Apresenta pele nua, nas faces, de cor branca e com pequenas penas escuras, que formam riscas paralelas. Distingue-se pela plumagem verde na coroa e na fronte. Sendo considerada uma das mais bonitas espécies de arara. Machos, fêmeas e juvenis apresentam todos plumagem semelhante."));
        setorAv.add(new Ave("Luna", "Arara-azul-e-amarela", Animal.FEMEA, "frugivoro", 14, "Apresenta pele nua, nas faces, de cor branca e com pequenas penas escuras, que formam riscas paralelas. Distingue-se pela plumagem verde na coroa e na fronte. Sendo considerada uma das mais bonitas espécies de arara. Machos, fêmeas e juvenis apresentam todos plumagem semelhante."));
        setorAv.add(new Ave("Luan", "Arara-militar-mexicana", Animal.MACHO, "frugivoro", 12, "A plumagem é predominantemente verde-azeitona, masdistingue-se pela fronte e base da cauda vermelhas. Aextremidade das asas é azul e na face apresenta pelenua com pequenas penas de cor negra que formam umpadrão de estrias transversais."));
        setorAv.add(new Ave("Zeca2", "Arara-militar-mexicana", Animal.FEMEA, "frugivoro", 4, "A plumagem é predominantemente verde-azeitona, masdistingue-se pela fronte e base da cauda vermelhas. Aextremidade das asas é azul e na face apresenta pelenua com pequenas penas de cor negra que formam umpadrão de estrias transversais."));
        setorAv.add(new Ave("Pituco3", "Catatua-de-bico-comprido", Animal.MACHO, "herbivoro", 62, "Distingue-se pela banda de cor escarlate na garganta, e pelas penas  amarelas na zona inferior da cauda.  Apresenta um grande anel periocular (em  torno dos olhos) de cor azul-viva. O bico é particularmente comprido  (mede 4-5 cm de comprimento) e é de cor azulada."));
        setorAv.add(new Ave("Pituco1", "Catatua-de-bico-comprido", Animal.FEMEA, "herbivoro", 16, "Distingue-se pela banda de cor escarlate na garganta, e pelas penas  amarelas na zona inferior da cauda.  Apresenta um grande anel periocular (em  torno dos olhos) de cor azul-viva. O bico é particularmente comprido  (mede 4-5 cm de comprimento) e é de cor azulada."));
        setorAv.add(new Ave("Pituco4", "Caturra", Animal.FEMEA, "granivoro", 1, "É uma catatua de tamanho pequeno com plumagem de coloração variável entre o cinzento, amarelo, branco ou acastanhado. Ambos os sexos apresentam auriculares alaranjadas, bico e patas cinzentas. A crista, presente em ambos os sexos, é amarela no macho."));
        setorAv.add(new Ave("Pituco5", "Caturra", Animal.MACHO, "granivoro", 5, "É uma catatua de tamanho pequeno com plumagem de coloração variável entre o cinzento, amarelo, branco ou acastanhado. Ambos os sexos apresentam auriculares alaranjadas, bico e patas cinzentas. A crista, presente em ambos os sexos, é amarela no macho."));
        setorAv.add(new Ave("Pituco6", "Calau-da-papuásia", Animal.MACHO, "frugivoro", 3, "O macho é maior do que a fêmea e distingue-se pela plumagem laranja ou amarelada em torno da cabeça e pescoço. Ambos os sexos têm olhos vermelhos, cauda curta e branca, e pele nua de coloração azulada em torno dos olhos e garganta."));
        setorAv.add(new Ave("Pituco7", "Calau-da-papuásia", Animal.FEMEA, "frugivoro", 5, "O macho é maior do que a fêmea e distingue-se pela plumagem laranja ou amarelada em torno da cabeça e pescoço. Ambos os sexos têm olhos vermelhos, cauda curta e branca, e pele nua de coloração azulada em torno dos olhos e garganta."));
        setorAv.add(new Ave("Pituco8", "Catatua-das-molucas", Animal.MACHO, "frugivoro", 6, ""));
        setorAv.add(new Ave("Pituco9", "Catatua-das-molucas", Animal.FEMEA, "frugivoro", 7, ""));
        setorAv.add(new Ave("Pituco0", "Cisne-negro", Animal.MACHO, "herbivoro", 8, "A plumagem é negra, exceto as extremidades das asas (rémiges primárias e secundárias), que são brancas, embora pouco visíveis. O bico é vermelho, com uma mancha branca na extremidade. Mede 1,6 a 2 metros de envergadura de asas."));
        setorAv.add(new Ave("Pitucoq", "Cisne-negro", Animal.FEMEA, "herbivoro", 9, "A plumagem é negra, exceto as extremidades das asas (rémiges primárias e secundárias), que são brancas, embora pouco visíveis. O bico é vermelho, com uma mancha branca na extremidade. Mede 1,6 a 2 metros de envergadura de asas."));
        setorAv.add(new Ave("Pitucow", "Flamingo-rubro", Animal.MACHO, "onivoro", 5, ""));
        setorAv.add(new Ave("Pitucoe", "Flamingo-rubro", Animal.FEMEA, "onivoro", 42, ""));
        setorAv.add(new Ave("Pitucor", "Caturra", Animal.MACHO, "granivoro", 32, ""));
        setorAv.add(new Ave("Pitucot", "Caturra", Animal.FEMEA, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucoy", "Caturra", Animal.MACHO, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucou", "Caturra", Animal.FEMEA, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucoi", "Caturra", Animal.MACHO, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucoo", "Caturra", Animal.FEMEA, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucop", "Caturra", Animal.MACHO, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucoa", "Caturra", Animal.FEMEA, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucos", "Caturra", Animal.MACHO, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucod", "Caturra", Animal.FEMEA, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucof", "Caturra", Animal.MACHO, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucog", "Caturra", Animal.FEMEA, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucoh", "Caturra", Animal.MACHO, "granivoro", 12, ""));
        setorAv.add(new Ave("Pitucoj", "Caturra", Animal.FEMEA, "granivoro", 12, ""));
        /*==================================================================================================*/
        setorR.add(new Reptil("Lagartão", "Hidrossauro-das-filipinasleão", Animal.MACHO, "onivoro", 12, ""));
        setorR.add(new Reptil("Luna", "Hidrossauro-das-filipinas", Animal.FEMEA, "onivoro", 14, ""));
        setorR.add(new Reptil("Luan", "Hidrossauro-das-filipinas", Animal.FEMEA, "onivoro", 12, ""));
        setorR.add(new Reptil("Zeca2", "Hidrossauro-das-filipinas", Animal.MACHO, "onivoro", 4, ""));
        setorR.add(new Reptil("Zeca3", "Hidrossauro-das-filipinas", Animal.FEMEA, "onivoro", 62, ""));
        setorR.add(new Reptil("Zeca1", "Hidrossauro-das-filipinas", Animal.MACHO, "onivoro", 16, ""));
        setorR.add(new Reptil("Zeca4", "Hidrossauro-das-filipinas", Animal.FEMEA, "onivoro", 1, ""));
        setorR.add(new Reptil("Zeca5", "Hidrossauro-das-filipinas", Animal.MACHO, "onivoro", 22, ""));
        setorR.add(new Reptil("Zeca6", "Hidrossauro-das-filipinas", Animal.FEMEA, "onivoro", 3, ""));
        setorR.add(new Reptil("Zeca7", "Hidrossauro-das-filipinas", Animal.MACHO, "onivoro", 5, ""));
        setorR.add(new Reptil("Zeca8", "Tartaruga-grega", Animal.FEMEA, "herbivoro", 6, ""));
        setorR.add(new Reptil("Zeca9", "Tartaruga-grega", Animal.MACHO, "herbivoro", 7, ""));
        setorR.add(new Reptil("Zeca0", "Tartaruga-grega", Animal.FEMEA, "herbivoro", 8, ""));
        setorR.add(new Reptil("Zecaq", "Tartaruga-grega", Animal.MACHO, "herbivoro", 9, ""));
        setorR.add(new Reptil("Zecaw", "Tartaruga-grega", Animal.FEMEA, "herbivoro", 5, ""));
        setorR.add(new Reptil("Zecae", "Tartaruga-grega", Animal.MACHO, "herbivoro", 42, ""));
        setorR.add(new Reptil("Zecar", "Crocodilo-do-nilo", Animal.FEMEA, "carnivoro", 32, ""));
        setorR.add(new Reptil("Zecat", "Crocodilo-do-nilo", Animal.MACHO, "carnivoro", 12, ""));
        setorR.add(new Reptil("Zecay", "Crocodilo-do-nilo", Animal.FEMEA, "carnivoro", 12, ""));
        setorR.add(new Reptil("Zecau", "Crocodilo-do-nilo", Animal.MACHO, "carnivoro", 12, ""));
        setorR.add(new Reptil("Zecai", "Crocodilo-do-nilo", Animal.FEMEA, "carnivoro", 12, ""));
        setorR.add(new Reptil("Zecao", "Crocodilo-do-nilo", Animal.MACHO, "carnivoro", 12, ""));
        setorR.add(new Reptil("Zecap", "Crocodilo-do-nilo", Animal.FEMEA, "carnivoro", 12, ""));
        setorR.add(new Reptil("Zecaa", "Crocodilo-do-nilo", Animal.MACHO, "carnivoro", 12, ""));
        setorR.add(new Reptil("Zecas", "Iguana-verde", Animal.FEMEA, "onivoro", 12, ""));
        setorR.add(new Reptil("Zecad", "Iguana-verde", Animal.MACHO, "onivoro", 12, ""));
        setorR.add(new Reptil("Zecaf", "Iguana-verde", Animal.FEMEA, "onivoro", 12, ""));
        setorR.add(new Reptil("Zecag", "Iguana-verde", Animal.MACHO, "onivoro", 12, ""));
        setorR.add(new Reptil("Zecah", "Iguana-verde", Animal.FEMEA, "onivoro", 12, ""));
        setorR.add(new Reptil("Zecaj", "Iguana-verde", Animal.MACHO, "onivoro", 12, ""));
        /*==================================================================================================*/
        setorAn.add(new Anfibio("x9", "Axolote", Animal.FEMEA, "carnivoro", 12, "Salamandra com aspeto larvar mesmo no estado adulto (neotenia). \n" +
"\n" +
"Comprimento total: até 30 cm. Distingue-se pela presença de 3 pares de brânquias externas plumosas nos dois lados da cabeça. Apresenta barbatana caudal desde a parte terminal da cabeça até à extremidade do corpo. Os membros são curtos e fracos, constituídos por cartilagem. Pulmões rudimentares. A pele é escura podendo variar entre o cinza e o castanho, muitas vezes com manchas. Indivíduos albinos são comuns."));
        setorAn.add(new Anfibio("Luna", "Axolote", Animal.FEMEA, "carnivoro", 14, "Salamandra com aspeto larvar mesmo no estado adulto (neotenia). \n" +
"\n" +
"Comprimento total: até 30 cm. Distingue-se pela presença de 3 pares de brânquias externas plumosas nos dois lados da cabeça. Apresenta barbatana caudal desde a parte terminal da cabeça até à extremidade do corpo. Os membros são curtos e fracos, constituídos por cartilagem. Pulmões rudimentares. A pele é escura podendo variar entre o cinza e o castanho, muitas vezes com manchas. Indivíduos albinos são comuns."));
        setorAn.add(new Anfibio("Luan", "Axolote", Animal.MACHO, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zeca2", "Axolote", Animal.FEMEA, "carnivoro", 4, ""));
        setorAn.add(new Anfibio("Zeca3", "Axolote", Animal.MACHO, "carnivoro", 62, ""));
        setorAn.add(new Anfibio("Zeca1", "Axolote", Animal.FEMEA, "carnivoro", 16, ""));
        setorAn.add(new Anfibio("Zeca4", "Axolote", Animal.MACHO, "carnivoro", 1, ""));
        setorAn.add(new Anfibio("Zeca5", "Axolote", Animal.FEMEA, "carnivoro", 22, ""));
        setorAn.add(new Anfibio("Zeca6", "Axolote", Animal.MACHO, "carnivoro", 3, ""));
        setorAn.add(new Anfibio("Zeca7", "Axolote", Animal.FEMEA, "carnivoro", 5, ""));
        setorAn.add(new Anfibio("Zeca8", "Axolote", Animal.MACHO, "carnivoro", 6, ""));
        setorAn.add(new Anfibio("Zeca9", "Axolote", Animal.FEMEA, "carnivoro", 7, ""));
        setorAn.add(new Anfibio("Zeca0", "Axolote", Animal.MACHO, "carnivoro", 8, ""));
        setorAn.add(new Anfibio("Zecaq", "Axolote", Animal.FEMEA, "carnivoro", 9, ""));
        setorAn.add(new Anfibio("Zecaw", "Axolote", Animal.MACHO, "carnivoro", 5, ""));
        setorAn.add(new Anfibio("Zecae", "Axolote", Animal.FEMEA, "carnivoro", 42, ""));
        setorAn.add(new Anfibio("Zecar", "Axolote", Animal.MACHO, "carnivoro", 32, ""));
        setorAn.add(new Anfibio("Zecat", "Axolote", Animal.FEMEA, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecay", "Axolote", Animal.MACHO, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecau", "Rã-tomate", Animal.FEMEA, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecai", "Rã-tomate", Animal.MACHO, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecao", "Rã-tomate", Animal.FEMEA, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecap", "Rã-tomate", Animal.MACHO, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecaa", "Rã-tomate", Animal.FEMEA, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecas", "Rã-tomate", Animal.MACHO, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecad", "Rã-tomate", Animal.FEMEA, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecaf", "Rã-tomate", Animal.MACHO, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecag", "Rã-tomate", Animal.FEMEA, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecah", "Rã-tomate", Animal.MACHO, "carnivoro", 12, ""));
        setorAn.add(new Anfibio("Zecaj", "Rã-tomate", Animal.FEMEA, "carnivoro", 12, ""));
        /*==================================================================================================*/
        setorI.add(new Invertebrado("Arr", "Aranha Caranguejeira", Animal.MACHO, "carnivoro", 1, ""));
        setorI.add(new Invertebrado("Luna", "Aranha Caranguejeira", Animal.FEMEA, "carnivoro", 1, ""));
        setorI.add(new Invertebrado("Luan", "Aranha Caranguejeiramacaco", Animal.FEMEA, "carnivoro", 1, ""));
        setorI.add(new Invertebrado("Zeca2", "Aranha Caranguejeira", Animal.MACHO, "carnivoro", 4, ""));
        setorI.add(new Invertebrado("Zeca3", "Aranha Caranguejeira", Animal.FEMEA, "carnivoro", 1, ""));
        setorI.add(new Invertebrado("Zeca1", "Aranha Caranguejeira", Animal.MACHO, "carnivoro", 1, ""));
        setorI.add(new Invertebrado("Zeca4", "Aranha Caranguejeira", Animal.FEMEA, "carnivoro", 1, ""));
        setorI.add(new Invertebrado("Zeca5", "Aranha Caranguejeira", Animal.MACHO, "carnivoro", 2, ""));
        setorI.add(new Invertebrado("Zeca6", "Aranha Caranguejeira", Animal.FEMEA, "carnivoro", 3, ""));
        setorI.add(new Invertebrado("Zeca7", "Aranha Caranguejeira", Animal.MACHO, "carnivoro", 5, ""));
        setorI.add(new Invertebrado("Zeca8", "Aranha Caranguejeira", Animal.FEMEA, "carnivoro", 6, ""));
        setorI.add(new Invertebrado("Zeca9", "Aranha Caranguejeira", Animal.MACHO, "carnivoro", 7, ""));
        setorI.add(new Invertebrado("Zeca0", "Aranha Caranguejeira", Animal.FEMEA, "carnivoro", 8, ""));
        setorI.add(new Invertebrado("Zecaq", "Bicho-pau ", Animal.MACHO, "herbivoro", 9, ""));
        setorI.add(new Invertebrado("Zecaw", "Bicho-pau ", Animal.MACHO, "herbivoro", 5, ""));
        setorI.add(new Invertebrado("Zecae", "Bicho-pau ", Animal.FEMEA, "herbivoro", 4, ""));
        setorI.add(new Invertebrado("Zecar", "Bicho-pau ", Animal.MACHO, "herbivoro", 3, ""));
        setorI.add(new Invertebrado("Zecat", "Bicho-pau ", Animal.FEMEA, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecay", "Bicho-pau ", Animal.MACHO, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecau", "Bicho-pau ", Animal.FEMEA, "herbivoro", 2, ""));
        setorI.add(new Invertebrado("Zecai", "Bicho-pau ", Animal.MACHO, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecao", "Bicho-pau ", Animal.FEMEA, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecap", "Caracol-da-Mata-Atlântica", Animal.MACHO, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecaa", "Caracol-da-Mata-Atlântica", Animal.FEMEA, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecas", "Caracol-da-Mata-Atlântica", Animal.MACHO, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecad", "Caracol-da-Mata-Atlântica", Animal.FEMEA, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecaf", "Caracol-da-Mata-Atlântica", Animal.MACHO, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecag", "Caracol-da-Mata-Atlântica", Animal.FEMEA, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecah", "Caracol-da-Mata-Atlântica", Animal.MACHO, "herbivoro", 1, ""));
        setorI.add(new Invertebrado("Zecaj", "Caracol-da-Mata-Atlântica", Animal.FEMEA, "herbivoro", 1, ""));
        /*==================================================================================================*/

    }
    
    public static Animal busca_Animal(String nome, String tipo)
            throws noFoundAnimalException, moreThanOneAnimalException {/*Exceçoes que podem ser lançadas*/

        int count = 0;
        if (tipo.equals("Mamifero") || tipo.equals("Mamiferos")) {
            for (Mamifero s : Setores.setorM) {
                if (s.getNome().equals(nome)) {
                    count++;
                    duplicateM.add(s);
                }
            }
            if (count == 1) {
                return duplicateM.get(0);
            }
        }
        if (tipo.equals("Ave") || tipo.equals("Aves")) {
            for (Ave s : Setores.setorAv) {
                if (s.getNome().equals(nome)) {
                    count++;
                    duplicateAv.add(s);
                }
            }
            if (count == 1) {
                return duplicateAv.get(0);
            }
        }
        if (tipo.equals("Reptil") || tipo.equals("Repteis")) {
            for (Reptil s : Setores.setorR) {
                if (s.getNome().equals(nome)) {
                    count++;
                    duplicateR.add(s);
                }
            }
            if (count == 1) {
                return duplicateR.get(0);
            }
        }
        if (tipo.equals("Anfibio") || tipo.equals("Anfibios")) {
            for (Anfibio s : Setores.setorAn) {
                if (s.getNome().equals(nome)) {
                    count++;
                    duplicateAn.add(s);
                }
            }
            if (count == 1) {
                return duplicateAn.get(0);
            }
        }
        if (tipo.equals("Invertebrado") || tipo.equals("Invertebrados")) {
            for (Invertebrado s : Setores.setorI) {
                if (s.getNome().equals(nome)) {
                    count++;
                    duplicateI.add(s);
                }
            }
            if (count == 1) {
                return duplicateI.get(0);
            }
        }
        if (count <= 0) {
            //Exceção para animal inexistente
            throw new noFoundAnimalException("Este animal não existe");
        }
        if (count > 1) {
            //Exceção para animais de mesmo Nome
            throw new moreThanOneAnimalException("Este Animal esta duplicado");
        }
        return null;
    }

    public static ArrayList<Mamifero> getSetorM() {
        return setorM;
    }

    public static ArrayList<Reptil> getSetorR() {
        return setorR;
    }

    public static ArrayList<Ave> getSetorAv() {
        return setorAv;
    }

    public static ArrayList<Anfibio> getSetorAn() {
        return setorAn;
    }

    public static ArrayList<Invertebrado> getSetorI() {
        return setorI;
    }

    public static ArrayList<Mamifero> getDuplicateM() {
        return duplicateM;
    }

    public static ArrayList<Reptil> getDuplicateR() {
        return duplicateR;
    }

    public static ArrayList<Ave> getDuplicateAv() {
        return duplicateAv;
    }

    public static ArrayList<Anfibio> getDuplicateAn() {
        return duplicateAn;
    }

    public static ArrayList<Invertebrado> getDuplicateI() {
        return duplicateI;
    }

    public static void setSetorM(ArrayList<Mamifero> setorM) {
        Setores.setorM = setorM;
    }

    public static void setSetorR(ArrayList<Reptil> setorR) {
        Setores.setorR = setorR;
    }

    public static void setSetorAv(ArrayList<Ave> setorAv) {
        Setores.setorAv = setorAv;
    }

    public static void setSetorAn(ArrayList<Anfibio> setorAn) {
        Setores.setorAn = setorAn;
    }

    public static void setSetorI(ArrayList<Invertebrado> setorI) {
        Setores.setorI = setorI;
    }

    public static void setDuplicateM(ArrayList<Mamifero> duplicateM) {
        Setores.duplicateM = duplicateM;
    }

    public static void setDuplicateR(ArrayList<Reptil> duplicateR) {
        Setores.duplicateR = duplicateR;
    }

    public static void setDuplicateAv(ArrayList<Ave> duplicateAv) {
        Setores.duplicateAv = duplicateAv;
    }

    public static void setDuplicateAn(ArrayList<Anfibio> duplicateAn) {
        Setores.duplicateAn = duplicateAn;
    }

    public static void setDuplicateI(ArrayList<Invertebrado> duplicateI) {
        Setores.duplicateI = duplicateI;
    }

}
