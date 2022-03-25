import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/',
  headers: {
    'Access-Control-Allow-Origin': true,
  },
});

export default api;