/**
 * 김주원
 */
import axios from "axios";

const fetchApi = axios.create({
  baseURL: "", // API 기본 경로 설정
});

// 요청 전 header에 token 정보 담기
fetchApi.interceptors.request.use(
<<<<<<< HEAD
    (config) => {
        const token = localStorage.getItem('token');
        if (token) {
            config.headers.Authorization = `${token}`;
        } else {
            // 로컬 스토리지 비우기
            // localStorage.clear();
            // window.location.href = '/error';
        }
        return config;
    },
    (error) => Promise.reject(error)
=======
  (config) => {
    const token = localStorage.getItem("token");
    if (token) {
      config.headers.Authorization = `${token}`;
    } else {
      // 로컬 스토리지 비우기
      //   localStorage.clear();
    //   window.location.href = "/error";
    }
    return config;
  },
  (error) => Promise.reject(error)
>>>>>>> ba141e337e6d7d7dc833b18f9abfb3fb53098962
);

// 응답에 대한 처리
fetchApi.interceptors.response.use(
<<<<<<< HEAD
    (response) => {
        return response;
    },
    (error) => {
        if (error.response.status === 403) { // 토큰인증 만료
            // 로컬 스토리지 비우기
            // localStorage.clear();

            error.response.statusText = 'Unauthorized';
            // window.location.href = '/error';
        }
        return Promise.reject(error);
    },
=======
  (response) => {
    return response;
  },
  (error) => {
    if (error.response.status === 403) {
      // 토큰인증 만료
      // 로컬 스토리지 비우기
      //   localStorage.clear();

      error.response.statusText = "Unauthorized";
      window.location.href = "/error";
    }
    return Promise.reject(error);
  }
>>>>>>> ba141e337e6d7d7dc833b18f9abfb3fb53098962
);

export default fetchApi;
