WeatherApp

WeatherApp é um aplicativo Android desenvolvido em Kotlin que fornece previsão do tempo atual e detalhada para uma localização específica.
Funcionalidades

    Previsão do Tempo Atual: Mostra a condição climática atual, temperatura, velocidade do vento, umidade e probabilidade de chuva.
    Localização Atual: Detecta automaticamente a localização atual do usuário usando o serviço de localização do dispositivo.
    Pesquisa de Localização: Permite ao usuário pesquisar o tempo para uma localização específica digitando o nome da cidade.
    Atualização Automática: Atualiza automaticamente os dados do clima a cada intervalo definido.

Screenshots

    
Como Usar

    Clone o repositório:

bash

git clone https://github.com/matheusanjo/WeatherApp.git

    Abra o projeto no Android Studio.
    Execute o aplicativo em um emulador ou dispositivo Android.

Tecnologias Utilizadas

    Kotlin
    Android Jetpack Components (ViewModel, LiveData, Lifecycle)
    Retrofit para comunicação com a API de previsão do tempo
    Glide para carregar imagens
    Google Play Services Location para obter a localização atual
    RecyclerView para exibir a lista de previsões de tempo
    ConstraintLayout para o layout da interface do usuário

API Utilizada

O aplicativo utiliza a API OpenWeatherMap para obter os dados de previsão do tempo.
Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.
Licença
