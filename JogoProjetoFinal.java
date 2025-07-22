import java.util.Scanner;

public class JogoProjetoFinal {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escolha seu personagem:");
        System.out.println("1 - Michael Collins");
        System.out.println("2 - Valentina Tina");
        System.out.println("3 - Jonas");

        int escolhaPersonagem = scanner.nextInt();

        switch (escolhaPersonagem) {
            case 1:
                jogarMichael();
                break;
            case 2:
                jogarValentina();
                break;
            case 3:
                jogarJonas();
                break;
            default:
                System.out.println("Opcao invalida. Reinicie o jogo e escolha um numero valido.");
                break;
        }
    }

    public static void jogarMichael() {
      
        System.out.println("Voce escolheu Michael Collins.");
        
        michaelIntroducao();
    }

    public static void jogarValentina() {
        
        System.out.println("Voce escolheu Valentina Tina.");
      
        valentinaIntroducao();
    }

    public static void jogarJonas() {
       
        System.out.println("Voce escolheu Jonas.");
       
        jonasIntroducao();
    }


    public static void michaelIntroducao() {
        
        System.out.println("Comeca a historia do Michael...");
       
        System.out.println("Michael Collins e um ator norte-americano consolidado , com uma carreira impressionante , com um total de 3 estatuetas de melhor ator , foi o ator principal \n" +
            "de filmes como Batman: O Cavaleiro Das Trevas ( 2008 ) \" , \" Warrior ( 2011 ) \" e \" Matrix ( 1999 ) \" , com uma personalidade marcante , arrogante e sarcastico ,\n" +
            " se torna uma pessoa complicada de se lidar , apos mais um ano de sucesso , michael foi indicado para mais um premio de melhor ator , o evento ocorrera nesse sabado a noite ,\n" +
            "Michael tera que atravessar o mundo , pois estava curtindo suas ferias no Brasil , e ele tera que ir rapido ja que o evento comecara a partir das 22h em Los Angeles , California.");
        System.out.println("Apos michael fazer suas malas , ele embarca em seu jatinho particular com pressa , Michael acabou caindo no sono com a tranquilidade da viagem , ate que o jato teve uma forte turbulencia ,\n" +
            "uma grande tempestade surge de repente e um raio acaba atingindo um dos motores e fez os piltos perderem o controle e o jatinho acabou caindo em uma ilha distante e desconhecida ate entao.");
        System.out.println("Logo depois do acidente de aviao Michael se encontra com consciencia, ja seus pilotos estavam desacordados e provavelmente mortos , \n" +
            "Michael sai pra fora do jatinho e se depara com uma grande ilha e a decide explorar o local , mas antes procura alguns itens que ainda restaram no aviao \n" +
            "Michael encontrou : oculos de prata \n" +
            "Michael adicionou oculos de prata no inventario");
        primeiraEscolha();
}

    public static void primeiraEscolha() {
        System.out.println("Depois de procurar itens Michael se da conta que nao sobreviveria 1 dia nessa ilha e precisava tomar alguma atitude, ja que a ilha nao tinha sinal de vida algum \n" +
            "Qual Opcao deseja escolher?");
        System.out.println("1 - Explorar a ilha ");
        System.out.println("2 - Usar o oculos de prata para fazer uma fogueira ");

        int escolha = scanner.nextInt();

        switch (escolha) {
    case 1:
        ExplorarIlha();
        break;
    case 2:
        UsarOculos();
        break;
    default:
  } 
}
public static void UsarOculos() {
        System.out.println("O sol ja estava se pondo e Michael usa seu oculos de prata contra a luz do Sol para fazer uma fogueira , apos acender o fogo ,\n" +
            "horas depois vem uma tempestade mais forte que a outra e Michael precisa achar abrigo na floresta.");
        System.out.println("1 - Explorar a ilha");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            ExplorarIlha();
        }
    }
    public static void ExplorarIlha() {
        System.out.println("Michael decide ir explorar a ilha , mas a escuridao ja vinha a tona , e isso estava dificultando sua visao e o deixando com medo ,\n" +
            "ate que a tempestade volta ainda mais forte e Michael precisa se refugiar na floresta.");
        System.out.println("Com uma chuva intensa e muitas trovoadas , Michael estava desesperado atras de um lugar para se refugiar ,\n" +
            "ate que aparece uma mulher encapuzada oferecendo ajuda, Michael aceita a ajuda mesmo desconfiado dela.");
        System.out.println("Michael fica muito curioso pra saber quem ela era e para onde ela estava levando ele.");
        System.out.println("A mulher encapuzada leva ele ate uma casa na arvore , apos relevar seu rosto , ela se apresenta a ele ,\n" +
            "Emma e a unica sobrevivente da ilha a mais de 4 anos , apos perder seu pai em um acidente em uma caverna");
        System.out.println("Emma conta a Michael a historia de seu pai , que foi um Almirante de seu pais , um cara Durao e imponente , e decidiu fazer uma viagem com sua filha ,\n" +
            "que teve um caso semelhante ao de Michael , que foi levado pela tempestade e obrigado a viver na ilha , ate conseguir se reerguer.");
        System.out.println("Comovido com a historia,  Michael pergunta o porque do acidente na caverna e ela lhe conta que quando seu pai estava explorando a ilha viu uma luz resulente vindo de uma caverna\n" +
            "e seu pai acabou descobrindo um tesouro perdido , e que seu pai acabou escorregando em uma ravina dentro da caverna e acabou morrendo.");
        System.out.println("Michael contou um pouco da sua vida , e de suas habilidades tantos nas cameras e como duble , para atuar em filmes de acoes ,\n" +
            "ele teve que passar por treinamentos rigidos e estava confiante para ir atras do tesouro e ajudar ela a ir embora dessa ilha.");
        System.out.println("Decididos a ir atras do tesouro , eles criam coragem e vao em busca da recompensa.");
        System.out.println("Apos entrarem na caverna , Emma fala para o Michael que ela possui algumas armadilhas , e que o pai dela passou por elas sem dificuldades algumas.");
        System.out.println("Michael era extremamente habilidoso e passava sem dificuldades pelas armadilhas , e Emma passou tranquilamente tambem e isso deixou o Michael impressionado.");
        System.out.println("Emma percebeu que estava chegando perto da ravina onde seu pai tinha escorregado , e alertou o Michael , Emma jogou uma corda para ver a profundidade e amarrou em uma rocha e os 2 desceram  pro fundo da caverna em busca do tesouro.");
        System.out.println("Depois de descerem tranquilamente eles seguiram com uma tocha iluminando o caminho , ate que de repente eles avistam uma luz forte vindo do outro lado da caverna e curiosos foram conferir.");
        System.out.println("Quando atravessaram a caverna , avistaram um altar com um Amuleto de ouro brilhando e iluminando a caverna e eles ficaram empolgados por descobrirem o tesouro.");
        System.out.println("Emma fica obcecada pelo tesouro e acerta o Michael pela costas e rouba o Amuleto e foge apos roubar o tesouro.");
        System.out.println("A caverna comecou a desmoronar , apos Emma retirar o Amuleto do lugar , ela foge , o deixa na caverna , ate que de repente o Pai de Emma nao estava morto e intervem para ajudar Michael a escapar da caverna");
        System.out.println("Depois de conseguirem escapar , Michael vai atras da Emma e consegue interceptar ela , ele estava junto com o pai dela , e ela estava desacreditada ao rever o pai apos todo aquele episodio.");
        System.out.println("Entao comeca uma discussao entre o pai e a filha e cada um conta uma versao especifica da sua historia e Michael fica em duvida em quem ajudar.");
        System.out.println("1 - Lutar contra Emma e ajudar o Pai dela.");
        System.out.println("2 - Se juntar com Emma e confrontar o Pai dela.");

        int escolha = scanner.nextInt();

    switch (escolha) {
    case 1:
        lutarcontraemma();
        break;
    case 2:
        juntacomemma();
        break;
}

}
    public static void lutarcontraemma() {
        System.out.println("Michael decide lutar contra Emma,\n" +
            "ela era uma grande combatente para ajudar o pai dela, foi uma luta intensa, mas o Michael se consagrou\n" +
            "vitorioso");
        System.out.println("O Amuleto era o coracao da ilha e ela comecou a se autodestruir e eles tinham que fugir.");
        System.out.println("Os Pilotos do Jatinho nao estavam mortos e\n" +
            "buscaram ajuda , um Helicoptero estava pronto para decolar esperando Michael.\n" +
            "1- Ir embora e levar o pai de Emma.\n" +
            "2 - Ajudar a Emma, mesmo depois da traicao.");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            IrEmbora();
        } else if (escolha == 2) {
            AjudarEmma();
        }
    }

    public static void IrEmbora() {
        System.out.println("O coracao do pai fala mais alto e ele salva sua filha e foge junto com Michael.");
    }

    public static void AjudarEmma() {
        System.out.println("Michael foi embora junto com Emma e deixou o pai dela junto com a ilha.");
    }

    public static void juntacomemma() {
        System.out.println("- Michael se junta com Emma e enfrenta o Pai de emma , Foi um combate dificil o Pai dela era mais alto\n" +
            "e forte fisicamente , mas o Michael saiu de pe na batalha.");
        System.out.println("2- O Amuleto era o coracao da ilha e ela comecou a se autodestruir e eles tinham que fugir.");
        System.out.println("Os Pilotos do Jatinho nao estavam mortos e buscaram ajuda , um Helicoptero estava pronto para decolar esperando Michael.\n" +
            "1- Ir embora e levar a Emma junto\n" +
            "2 - Ajudar o pai de Emma , a nao ser destruido junto com a ilha.");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            IrEmboraEmma();
        } else if (escolha == 2) {
            AjudarPai();
        }
    }

    public static void IrEmboraEmma() {
        System.out.println("Michael foi embora junto com Emma e deixou o pai dela junto com a ilha.");
    }

    public static void AjudarPai() {
        System.out.println("Michael e Emma esperam ate o ultimo segundo e salvam o Pai de Emma eles escapam da ilha.");
    }
    
    
    public static void valentinaIntroducao() {
        System.out.println("Comeca a historia da Valentina...");

        System.out.println("Valentina Tina e uma popstar famosa mundialmente, adorada por fas de diferentes continentes, que estava indo ate as ilhas do Caribe para um ensaio de fotos para a Vogue.");
        System.out.println("Enquanto voava em seu jatinho, o inesperado aconteceu. O piloto teve um ataque cardiaco, e o jatinho caiu em uma ilha desconhecida.");

        escolhaUm();
}

    public static void escolhaUm() {
        System.out.println("\nO que Valentina Tina faz primeiro?:");
        System.out.println("1 - Procura um hotel");
        System.out.println("2 - Busca por seu espelho");
        System.out.println("3 - Procura ajuda");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                caminhoMacaquinho();
                break;
            case 2:
                sobreviveSozinha();
                break;
            case 3:
                encontraNativo();
                break;
            default:
                System.out.println("Escolha invalida. Tente novamente.");
                primeiraEscolha();
        }
    }

    public static void caminhoMacaquinho() {
        System.out.println("\nValentina Tina anda pela ilha a procura de um hotel, mas em vez disso, se depara com um pequeno macaquinho.");
        System.out.println("O que Valentina Tina faz?");
        System.out.println("1 - Segue o macaco");
        System.out.println("2 - Ignora o macaco");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                seguirMacaquinho();
                break;
            case 2:
                ignoraMacaquinho();
                break;
            default:
                System.out.println("Escolha invalida. Tente novamente.");
                caminhoMacaquinho();
        }
    }

    public static void seguirMacaquinho() {
        System.out.println("\nValentina Tina segue o macaquinho, que a leva ate uma clareira com agua potavel e comida.");
        System.out.println("Final 1: Ela vive entre os macacos e depois inaugura um resort na ilha.");
    }

    public static void ignoraMacaquinho() {
        System.out.println("\nValentina Tina decide ignorar o macaquinho.");
        System.out.println("Final 2: Ela nao consegue sobreviver sozinha na ilha.");
    }

    public static void sobreviveSozinha() {
        System.out.println("\nValentina Tina achou um pequeno espelho em sua bolsa.");
        System.out.println("O que ela faz agora?");
        System.out.println("1 - Jogar o espelho para sinalizar");
        System.out.println("2 - Guardar o espelho");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("\nO espelho caiu no mar. O que ela faz agora?");
            System.out.println("1 - Procurar outro objeto");
            System.out.println("2 - Procurar ajuda");

            int novaEscolha = scanner.nextInt();

            if (novaEscolha == 1) {
                System.out.println("\nEla encontra um canivete e tenta sobreviver.");
                System.out.println("Final 3: Valentina Tina morre por nao saber usar o canivete.");
            } else if (novaEscolha == 2) {
                System.out.println("\nEla se perde na mata tentando achar ajuda.");
                System.out.println("Final 6: Valentina Tina some sem deixar rastros.");
            } else {
                System.out.println("Escolha invalida. Tente novamente.");
                sobreviveSozinha();
            }

        } else if (escolha == 2) {
            System.out.println("\nA tarde esta chegando. Valentina Tina usa o espelho para fazer uma fogueira.");
            System.out.println("No dia seguinte, o que ela faz?");
            System.out.println("1 - Escreve S.O.S. na areia");
            System.out.println("2 - Procura comida");

            int novaEscolha = scanner.nextInt();

            switch (novaEscolha) {
                case 1:
                    System.out.println("\nFinal 4: Um marinheiro a resgata e ela lanca o album 'Isla Pop'.");
                    break;
                case 2:
                    System.out.println("\nFinal 5: Um coco cai em sua cabeca e ela morre.");
                    break;
                default:
                    System.out.println("Escolha invalida. Tente novamente.");
                    sobreviveSozinha();
            }

        } else {
            System.out.println("Escolha invalida. Tente novamente.");
            sobreviveSozinha();
        }
    }

    public static void encontraNativo() {
        System.out.println("\nValentina Tina encontra um nativo. O que ela faz?");
        System.out.println("1 - Tentar conversar com ele");
        System.out.println("2 - Fugir assustada");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                conversarNativo();
                break;
            case 2:
                fugirNativo();
                break;
            default:
                System.out.println("Escolha invalida. Tente novamente.");
                falarNativo();
        }
    }

    public static void conversarNativo() {
        System.out.println("\nValentina Tina nao entende a lingua do nativo, mas ele parece amigavel.");
        System.out.println("O nativo a convida para ir ate sua oca. Ela aceita?");
        System.out.println("1 - Sim");
        System.out.println("2 - NÃ£o");

        int escolha = scanner.nextInt();

        if (escolha == 1 || escolha == 2) {
            System.out.println("Final 7: Ela se apaixona pelo nativo e vive com ele na ilha.");
        } else {
            System.out.println("Escolha invalida. Tente novamente.");
            conversarNativo();
        }
    }

    public static void fugirNativo() {
        System.out.println("\nEla tenta fugir, mas o nativo tenta segura-la.");
        System.out.println("O que ela faz?");
        System.out.println("1 - Seguir o nativo ate a aldeia");
        System.out.println("2 - Ficar onde esta e observar");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            aldeia();
        } else if (escolha == 2) {
            falarNativo();
        } else {
            System.out.println("Escolha invalida. Tente novamente.");
            fugirNativo();
        }
    }

    public static void aldeia() {
        System.out.println("\nEla e levada para a aldeia, mas as mulheres descobrem que seus maridos estavam flertando com Valentina Tina.");
        System.out.println("Final 8: Ela e expulsa e morre sozinha na floresta.");
    }

    public static void falarNativo() {
        System.out.println("\nOs nativos acham que ela e uma ameaca");
        System.out.println("Final 9: Valentina Tina e atacada por um animal selvagem.");
    }

    public static void jonasIntroducao() {
        System.out.println("Comeca a historia do Jonas...");
        
        inicio();
    }      
  public static void inicio() {
        
    System.out.println("Jonas e um marinheiro veterano do exercito do Paraguai,\n" +
                "com boas habilidades de localizacao e combate, incluindo desarme de bombas.\n");
    System.out.println("Em uma missao para investigar movimentacoes no noroeste do Oceano Pacifico,\n" +
                "seu submarino e atacado por um ser desconhecido.\n");
    System.out.println("Desmaiado, Jonas acorda naufragado em uma ilha com apenas um alicate.\n");
    System.out.println("Diante dele ha: uma plantacao de milho, uma floresta com fumaca, e uma estrada de terra.\n" +
                "Para onde deseja ir?\n(1) Plantacao\n(2)floresta com fumaca\n(3)estrada de terra");
    escolha1();
    }

    public static void escolha1() {
        int escolha = scanner.nextInt();
    switch (escolha) {

        case 1:

            plantacao();

            break;

        case 2:

            floresta();

            break;

        case 3:

            estrada();

            break;

        default:

            System.out.println("Escolha invalida. Tente novamente!");
        escolha1();

    }
}
    public static void plantacao() {
        System.out.println("De repente, ele escuta um som estranho: barulho de um movimento leve,\n" +
                "como se alguem ou algo se movesse entre as plantas.\nJonas se esconde rapidamente e percebe um pequeno grupo de pessoas.\n" +
                "(2) Tentar se comunicar\n(3) Observar em silencio");
        int escolha = scanner.nextInt();
        if (escolha == 2) morteComunicacao();
        else if (escolha == 3) observarNativo();
        else plantacao();
    }

    public static void morteComunicacao() {
        System.out.println("Ao tentar se comunicar, os nativos se assustam e disparam contra Jonas.\nJonas morre.");
    }

    public static void observarNativo() {
        System.out.println("Jonas descobre que o grupo esta coletando plantas raras suspeitas.\n" +
                "Curioso com o objetivo dos nativos, ele se revela lentamente.\n" +
                "(1) Roubar as plantas\n(2) Oferecer ajuda");
        int escolha = scanner.nextInt();
        if (escolha == 1) roubarPlantas();
        else if (escolha == 2) oferecerAjuda();
        else observarNativo();
    }

    public static void roubarPlantas() {
        System.out.println("Jonas segue sorrateiramente os nativos, chegando no acampamento deles.\n" +
                "Com isso, Jonas continua seguindo o grupo ate uma cabana maior,\n" +
                "onde encontra o estoque principal deles. Ele se esconde,\n" +
                "espera a maioria se retirar e comeca a saquear.\n" +
                "Ao continuar procurando itens, Jonas esbarra em um objeto e e localizado.\n" +
                "(1) Foge para a mata\n(2) Enfrenta os nativos");
        int escolha = scanner.nextInt();
        if (escolha == 1) morteFuga();
        else if (escolha == 2) enfrentarNativos();
        else roubarPlantas();
    }

    public static void morteFuga() {
        System.out.println("Ao fugir, Jonas acaba sendo ALVEJADO e morre.");
    }

    public static void enfrentarNativos() {
        System.out.println("Jonas os enfrenta mas acaba sendo encurralado.\n" +
                "(1) Se entregar\n(2) Resistir");
        int escolha = scanner.nextInt();
        if (escolha == 1) oferecerAjuda();
        else if (escolha == 2) aprisionado();
        else enfrentarNativos();
    }

    public static void aprisionado() {
        System.out.println("Ao resistir, Jonas e capturado e aprisionado.\n" +
                "Jonas fica aprisionado ate o fim de sua vida...");
    }

    public static void oferecerAjuda() {
        System.out.println("Ao se entregar, ele explica tudo que aconteceu para ele chegar na situacao atual.\n" +
                "Entao, os nativos nao o veem como ameaca. Jonas oferece ajuda.\n" +
                "(1) Ajudar sozinho\n(2) Ajudar em grupo");
        int escolha = scanner.nextInt();
        if (escolha == 1) explorarSozinho();
        else if (escolha == 2) explorarComGrupo();
        else oferecerAjuda();
    }

    public static void explorarSozinho() {
        System.out.println("Explorando a ilha, Jonas encontra plantas no topo de uma ribanceira.\n" +
                "Ele a escala, mas um militar chega primeiro nas plantas e as pega.\n" +
                "Jonas espera o momento certo e puxa o militar, derrubando-o.\n" +
                "O impacto atrai outros militares.\n" +
                "(1) Se afastar da regiao\n(2) Ficar e combater os militares");
        int escolha = scanner.nextInt();
        if (escolha == 1) fugaTortura();
        else if (escolha == 2) sacrificio();
        else explorarSozinho();
    }

    public static void fugaTortura() {
        System.out.println("Jonas se depara com outro esquadrao militar e e capturado.\n" +
                "Torturado, ele nao revela nada.\n" +
                "Um dos militares o solta por diversao e da 30 segundos para fugir.\n" +
                "Jonas causa um escandalo, abate um militar e aciona granadas,\n" +
                "causando uma explosao. Isso facilita o ataque dos nativos,\n" +
                "que roubam os barcos e fogem da ilha.");
    }

    public static void sacrificio() {
        System.out.println("Jonas e encurralado e se sacrifica, garantindo o abate de 7 militares\n" +
                "(de um esquadrao de elite americano).");
    }

    public static void explorarComGrupo() {
        System.out.println("Jonas caminha com o grupo. Sao cinco, incluindo Lew, um nativo forte\n" +
                "com cicatrizes e olhar desconfiado. Lew desaparece durante a coleta de plantas\n" +
                "e depois aparece com uma arma apontada para outro nativo.\n" +
                "\"Jonas e isca! Um deles! Vi o simbolo da marinha dele em um drone!\"\n" +
                "(1) Convencer o grupo\n(2) Desarmar Lew rapidamente");
        int escolha = scanner.nextInt();
        if (escolha == 1) convencerGrupo();
        else if (escolha == 2) feridoMorre();
        else explorarComGrupo();
    }

    public static void feridoMorre() {
        System.out.println("Jonas desarma Lew, mas leva uma facada no abdomen.\n" +
                "A ferida infecciona e Jonas morre.");
    }

    public static void convencerGrupo() {
        System.out.println("Jonas derruba Lew com o cabo do alicate. O grupo se divide.\n" +
                "Alguns seguem com Jonas, outros cuidam de Lew. Na busca pela base militar,\n" +
                "o grupo e detectado. Jonas segue ate o laboratorio e encontra um cientista.\n" +
                "Ele revela que a toxina era para regeneracao de celulas-tronco,\n" +
                "mas ainda esta letal. Jonas precisa decidir:\n" +
                "(1) Acreditar no cientista\n(2) Nao acreditar");
        int escolha = scanner.nextInt();
        if (escolha == 1) acordoComCientista();
        else if (escolha == 2) explodirLaboratorio();
        else convencerGrupo();
    }

    public static void acordoComCientista() {
        System.out.println("Jonas decide acreditar. O cientista mostra o prototipo funcional.\n" +
                "Jonas exige que parem de usar a ilha como teste.\n" +
                "Os cientistas concordam. Os nativos sao poupados\n" +
                "e Jonas e levado de volta para casa pelos militares.");
    }

    public static void explodirLaboratorio() {
        System.out.println("Jonas explode o laboratorio e por meses a paz reina.\n" +
                "Mas os militares voltam, constroem uma base mais tecnologica,\n" +
                "e erradicam quase todos os nativos...");
    }
        
    public static void floresta() {
        System.out.println("Jonas decide ir para a floresta,\n" +
"ao chegar no meio da mesma se localizar se \n" +
"tornava muito dificil devido as arvores e ao \n" +
"olhar pra cima a unica coisa visivel era a\n" +
"fumaca pela qual Jonas segue, ao alcancar \n" +
"a origem da fumaca encontra uma fogueira\n" +
"pela qual Annie, uma aeromoca Russa que diz\n" +
"ter chegado ali apos seu aviao cair.\n" +
"Voce decide se juntar a ela?\n" +
" sim (1) ou nao (2)?");
        int escolha = scanner.nextInt();
        if (escolha == 1) seJuntar();
        else if (escolha == 2) naoSeJuntar();
        else floresta();
    }
        
    public static void naoSeJuntar() {    
        System.out.println("Entao voce e visto como um inimigo. Voce descobre\n" +
"que ela convenientemente era faixa preta em kung fu do estilo shao lin do norte,\n" + 
" ela te aplica um chute mortal do tigre em seu estomago e voce morre instantaneamente."); 
    }
    public static void seJuntar() {
        System.out.println("Voces aproveitam a fogueira para se esquentar\n" +
"e Jonas entao caca alguns peixes em um rio que\n" +
"corta a floresta para prepararem na fogueira,\n" +
"ao comer e descansar na fogueira voces se\n" +
"sentem observados, voces decidem:\n" + "(1)Continuar no acampamento.\n" +
"(2)Explorar a floresta.\n"  +  "(3)Ir atras das movimentacoes estranhas da floresta.");
        int escolha = scanner.nextInt();
        switch (escolha) {
                    case 1:

            acampamento();

            break;

        case 2:

            explorarFloresta();

            break;

        case 3:

            estranheza();

            break;

        default:

            System.out.println("Escolha invalida. Tente novamente!");
        seJuntar();
        }     
    }
    public static void acampamento() {
        System.out.println("Voces sao atacados pelo exercito americano e morrem.");
    }
    public static void explorarFloresta() {
        System.out.println("Voces continuam explorando a floresta\n" +
"ate que encontram um alojamento americano.\n" +
"(1)decidem se infiltrar.\n" + "(2)Fugir.");
        int escolha = scanner.nextInt();
        if (escolha == 1) infiltrar();
        else if (escolha == 2) fugir();
        else explorarFloresta();
    }
    public static void estranheza() {
        System.out.println("Annie se arma com uma pedra e voce\n" +
"decide confiar em suas habilidades\n" +
"de combate corpo a corpo, a luz do luar\n" +
"voces saem para cacar, movimentacoes de\n" +
"animais por todos os lados e voces continuam,\n" +
"explorando quando de repente sao atacados por\n" +
"tres homens fardados e ao ter que lutar com\n" +
"dois ao mesmo tempo percebe que e o exercito\n" +
"americano (malditos americanos), voce consegue\n" +
"derrotar os dois mas ao nocautea-los,\n" +
"percebe que Annie desapareceu,\n" +
"com isso voce tem acesso a farda dos americanos\n" +
"e um radio,\n" +
"voce decide:\n" +
"(1) Se infiltrar no exercito americano.\n" +
"(2) Ir atras de Annie.");
        int escolha = scanner.nextInt();
        if (escolha == 1) exercito();
        else if (escolha == 2) annie();
        else estranheza();
    }
    public static void infiltrar() {
        System.out.println("(1)Voces se infiltram escondidos e conseguem nocautear dois guardas,\n" +
    "voces vestem as fardas dos guardas nocauteados e\n" +
    "como eles eram apenas guardas que ninguem ligava,\n" +
    "ninguem percebeu que voces eram impostores, eventualmente a missao na ilha acaba,\n" +
    "voce volta para os Estados Unidos com Annie e o batalhao, foge do Pais,\n" +
    "volta ao Paraguai e se casa com Annie.\n" +
    "(Final Romantico <3)");
    }
    public static void fugir() {
        System.out.println("(2) Voces tentam fugir correndo e\n" +
    "acabam fazendo barulho demais, os guardas veem voces reconhecem\n" +
    "a farda paraguaia te atacam e voces morrem.");
    }
    public static void exercito() {
        System.out.println("Voce veste a farda americana e pega o radio, ao vesitr a\n" +
"farda ve um pingente no peito escrito recruta ratao e entao\n" +
"clica no radio e diz alguem na escuta? te perguntam sobre\n" +
"o marinheiro  paraguiao e voce diz que ele fugiu. Ao vascular os\n" +
"bolsos da farda e encontra um mapa com a localizacao da base americana, alojamento dos recrutas e o submarino.\n" +
"Qual caminho seguir?\n" +
"(1) Base Americana.\n" +
"(2) Alojamento dos recrutas.\n" +
"(3) Submarino.");
        int escolha = scanner.nextInt();
        switch (escolha) {
        case 1:

            base();

            break;

        case 2:

            alojamento();

            break;

        case 3:

            submarino();

            break;

        default:

            System.out.println("Escolha invalida. Tente novamente!");
    exercito();
        }
    }
    public static void base() {
        System.out.println("Voce vai a base americana, encontra Annie\n" +
"amarrada, ela tenta gritar por voce, porem\n" +
"ninguem entende nada por causa da fita\n" +
"na boca dela, porem voce percebe e assiste o sofrimento\n" +
"dela em silencio prezando por sua vida, ao longo do tempo voce muda seu vulgo\n" +
"no batalhao e se infiltra cada vez mais no exercito americano, eventualmente a\n" +
"missao na ilha acaba, voce volta para os Estados Unidos com o seu batalhao,\n" +
"foge do Pais e volta ao Paraguai.\n" +
"(Final Covarde)");
    }
    public static void alojamento() {
        System.out.println("Voce vai ao alojamento dos recrutas\n" +
"e encontra aonde o recruta ratao se alocava\n" +
"porem os companheiros de dormitorio\n" +
"do ratao reconhecem que voce nao nao e ele,\n" +
"eles te capturam e voce e morto.");
    }
    public static void submarino() {
        System.out.println("(3) Voce chega ao submarino, encontra alguns marinheiros americanos,\n" +
"voce diz ter sido chamado para verificar os equipamentos de pressurizacao,\n" +
"voce se infiltra e com suas habilidades de luta, nocauteia e finaliza um por um,\n" +
"utiliza seus conhecimentos de localizacao para voltar ao Paraguai e ao chegar recebe\n" +
"diversos premios da marinha paraguaia por acabar com o batalhao americano que ameacava pais.");
    }
    public static void annie() {
        System.out.println("Ao analisar ao redor voceencontra pegadas\n" +
"e decide segui-las, ao seguir chega em uma\n" +
"base alocada pelos americanos,\n" +
"ao invadir voce se depara com alguns guardas\n" +
"porem consegue nocautea-los, e adentrar a porta\n" +
"escrito \"laboratorio\" encontra Annie amarrada com\n" +
"uma bomba relogio e a porta em suas costas e trancada,\n" +
"em seguida dos alto falantes ouve \"colabore conosco ou\n" +
"sua amiguinha sera explodida, voce tem 1 minuto para decidir...\"\n" +
"\"(1)Decide colaborar.\n" +
"(2)Tenta desarmar a bomba.\"");
        int escolha = scanner.nextInt();
        if (escolha == 1) colaborar();
        else if (escolha == 2) desarmarBomba();
        else annie();
    }
    public static void colaborar() {
        System.out.println("Voce decise colaborar e da informacoes confidenciais da marinha paraguaia\n" +
"para os americanos, apos falar sobre localizacao, armamento e vulnerabilidades da mesma,\n" +
"eles te traem como vocetraiu a marinha paraguaia e explode a bomba matando voce e Annie");
    }
    public static void desarmarBomba() {
        System.out.println("Com seus conhecimentos em desarme de bombas\n" +
"voce abre e consegue acesso a 4 fios convenientemente\n" +
"coloridos para escolher, qual voce decide cortar?\n" +
"(1)Azul.\n" +
"(2)Vermelho.\n" +
"(3)Amarelo.\n" +
"(4)Verde.");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                azul();
                break;
                
            case 2:
                vermelho();
                break;
            case 3:
                amarelo();
                break;
            case 4:
                verde();
                break;
            default:
                    System.out.println("Escolha invalida. Tente novamente!");
           desarmarBomba();
        }
    }
    public static void azul() {
        System.out.println("Voce corta o fio azul e o contador da bomba e zerado,\n" +
"logo em seguida a sala e invadida pelo sargento do batalhao\n" +
"americano com um rifle sedento para te matar, ele dispara uma rajada de tiros em sua direcao\n" +
"porem Annie fora do alvo do mesmo vai pelas suas costas e usa a pedra que levou para nocautear\n" +
"o sargento, voce encontra no bolso do mesmo um mapa que te guia ate aonde estava o submarino deles,\n" +
"vocÃƒÂª utiliza seus conhecimentos de localizacao para voltar ao Paraguai e ao chegar se casa com Annie\n" +
"e recebe diversos premios da marinha paraguaia por acabar com o batalhao americano que ameacava o pais,\n" +
"enfim vive feliz com sua esposa.");
    }
    public static void vermelho() {
        System.out.println("Voce corta o fio errado e a bomba explode!\n" +
"FIM!");
    }
    public static void amarelo() {
        System.out.println("Voce corta o fio errado e a bomba explode!\n" +
"FIM!");
    }
    public static void verde() {
        System.out.println("Voce corta o fio errado e a bomba explode!\n" +
"FIM!");
    }
    public static void estrada() {
        System.out.println("Ao decidir ir para a estrada de terra, por descuido Jonas tropeca e cai de um barranco, rolando o barranco a baixo, Jonas bate de cabeca em uma grande rocha e morre.");
    }
    
 
}