import { useState, useEffect } from "react";

const useWeather = (cityName) =>{

    const [weatherData,setWeatherData] = useState({})

    useEffect(()=>{
        fetch(`http://localhost:8080/${cityName}`)
        .then(reps => reps.json())
        .then(data => setWeatherData(data))
    },[cityName])

    return weatherData;
}

export default useWeather;