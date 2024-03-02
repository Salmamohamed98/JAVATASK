# ----------------------------
# build from source
# ----------------------------
FROM node:20-alpine3.18 AS build

WORKDIR /app

COPY package*.json .
RUN npm install -g @angular/cli
RUN npm install


COPY . .

RUN npm run build --configuration=production


# ----------------------------
# run with nginx
# ----------------------------
FROM nginx:alpine

RUN rm /etc/nginx/conf.d/default.conf
COPY nginx.conf /etc/nginx/conf.d
# Copy the built Angular app from the build stage to the NGINX web root directory
COPY --from=build /app/dist/test-multible-module /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Start Nginx
CMD ["nginx", "-g", "daemon off;"]