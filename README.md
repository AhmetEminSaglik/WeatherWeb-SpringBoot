BackEnd :

getWeather function :
Whole data will be got in json format according to entered city. 

(I wantted to add here what I did in this time because there is nothing to see in my backend code. 
New concepts : RestTemplate,gson,parsing json,Executorservices, endpoint, annotations, how to get data from API, endpoint...
Errors : json illegal access, servlet service, timer error, dispatch...
There are much more things that I encountered so far. When I could not do i searched it usually stackoverflow. 
I tried as much as I can do but i could not do most of the things.)


FrontEnd :  

app.js
City state is created in app.js. This state send to forms.js as props.
During this time custom useweather hook will be send to city state.
Data which is came from Useweather hook  is keept in weatherData variable. This variable sends to weather class as props.

useweather.js
when argument that is got from app.js is changed then, this hook sends to useEffect as dependency.
At the same time the date which came from api will assing to weatherdata variable. This variable will send to weather class as props.

form.js:
When submittted to form the state which is got from app.js is changed and useweather hook runs.

weather.js:
Data that came from Api will be shown.
