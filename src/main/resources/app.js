const jsonData = [
    // Paste your JSON data here
];

const renderTable = (data) => {
    const tableBody = document.getElementById("tableBody");

    const api = `localhost:8080/relatorios/1`


    fetch(api)
        .then(request => request.json())
        .then (data => {
            const row = document.querySelector("tr");
            row.innerHTML = `
                            <td>${item.id}</td>
                            <td>${item.acidezAtiva.phcalCl3}</td>
                            <td>${item.acidezAtiva.phh20}</td>
                            <td>${item.situacao.sequeiro}</td>
                            <td>${item.ctcEpH7.ctcEpH7}</td>
                            <td>${item.ctcEpH7.teorK}</td>
                            <td>${item.nutriente.ca}</td>
                            <td>${item.nutriente.mg}</td>
                            <td>${item.textura.arenosa}</td>
                        `;

            tableBody.appendChild(row);
        })
    renderTable(jsonData);
};
const jsonData = [
    // Paste your JSON data here
];

const renderTable = (data) => {
    const tableBody = document.getElementById("tableBody");

    const api = `localhost:8080/relatorios/1`


    fetch(api)
        .then(request => request.json())
        .then (data => {
            const row = document.querySelector("tr");
            row.innerHTML = `
                            <td>${item.id}</td>
                            <td>${item.acidezAtiva.phcalCl3}</td>
                            <td>${item.acidezAtiva.phh20}</td>
                            <td>${item.situacao.sequeiro}</td>
                            <td>${item.ctcEpH7.ctcEpH7}</td>
                            <td>${item.ctcEpH7.teorK}</td>
                            <td>${item.nutriente.ca}</td>
                            <td>${item.nutriente.mg}</td>
                            <td>${item.textura.arenosa}</td>
                        `;

            tableBody.appendChild(row);
        })
    renderTable(jsonData);
};
