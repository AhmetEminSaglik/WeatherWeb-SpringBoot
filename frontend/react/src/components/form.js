import React from "react";

const Form = (props) => {
    const { setCity } = props;

    const handleSubmit = (e) => {
        e.preventDefault();

        const value = document.getElementById("city-query");
        setCity(value.value.trim());
    };

    return (
        <form onSubmit={(e) => handleSubmit(e)}>
            <input id="city-query" placeholder="City Name" />
        </form>
    );
};

export default Form;
